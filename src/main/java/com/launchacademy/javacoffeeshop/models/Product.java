package com.launchacademy.javacoffeeshop.models;

public class Product {
  private Integer id;
  private String name;
  private String description;
  private Double price;
  private Integer caffeineRating;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getCaffeineRating() {
    return caffeineRating;
  }

  public void setCaffeineRating(Integer caffeineRating) {
    this.caffeineRating = caffeineRating;
  }


  public String setFontColor(){
    String className = "";
    if( caffeineRating == 0){
      className="caffeine-rating-0";
    }else if(caffeineRating ==1){
      className="caffeine-rating-1";
    }else if(caffeineRating ==2){
      className="caffeine-rating-2";
    }
    return className;
  }

  public String caffeineRatingString(){
    String ratingString = "";
    if( caffeineRating == 0){
      ratingString = "Low caffeine rating";
    }else if(caffeineRating ==1){
      ratingString = "Medium caffeine rating";
    }else if(caffeineRating ==2){
      ratingString = "High caffeine rating";
    }
    return ratingString;
  }
}
