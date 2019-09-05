package com.passawit;

public class Car {
  private String color;
  private String type;
  private int displacement;
  private boolean sunroof;
  private int speed;

  public Car() {}

  public Car(String color, String type, int displacement, boolean sunroof, int speed) {
    this.color = color;
    this.type = type;
    this.displacement = displacement;
    this.sunroof = sunroof;
    this.speed = speed;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getDisplacement() {
    return displacement;
  }

  public void setDisplacement(int displacement) {
    this.displacement = displacement;
  }

  public boolean isSunroof() {
    return sunroof;
  }

  public void setSunroof(boolean sunroof) {
    this.sunroof = sunroof;
  }

  public boolean hasSunroof() {
    return  this.sunroof;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
