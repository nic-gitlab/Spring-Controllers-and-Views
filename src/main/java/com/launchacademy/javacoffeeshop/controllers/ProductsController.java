package com.launchacademy.javacoffeeshop.controllers;

import com.launchacademy.javacoffeeshop.models.Product;
import com.launchacademy.javacoffeeshop.services.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductsController {
private ProductService productService;

@Autowired
  public ProductsController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping
  public String getProducts(Model model){

    List<Product> products = productService.findAll();
    model.addAttribute("products", products);

    return "products/index";
  }

  @GetMapping("/show/{id}")
  public String showOneProduct(@PathVariable Integer id, Model model) {
    Product product = productService.get(id);
    model.addAttribute("product", productService.get(id));

    return "products/show";
  }

  @GetMapping("/new")
  public String addNewProduct(@ModelAttribute Product product) {
    return "products/new";
  }

  @PostMapping
  public String createNewProduct(@ModelAttribute Product product ) {
    int id = productService.findAll().size() + 1 ;
    product.setId(id);
    productService.addToList(product);
    return "redirect:/products";
  }

}
