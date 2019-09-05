package com.passawit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class HelloWorldApplication {
  private static ArrayList<Car> carList = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public ResponseEntity<Car> update(@RequestBody Car car) {
    carList.add(car);

    return new ResponseEntity<>(car, HttpStatus.OK);
  }

  @RequestMapping(value = "/list")
  public ResponseEntity<ArrayList<Car>> list() {
    return new ResponseEntity<>(carList, HttpStatus.OK);
  }

  @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
  public ResponseEntity<Car> update(@PathVariable("id") int id, @RequestBody Car car) {
    String color = car.getColor();
    String type = car.getType();
    int displacement = car.getDisplacement();
    boolean hasSunroof = car.hasSunroof();
    int speed = car.getSpeed();

    if (id > 0 || id < carList.size()) {
      carList.get(id).setColor(color);
      carList.get(id).setType(type);
      carList.get(id).setDisplacement(displacement);
      carList.get(id).setSunroof(hasSunroof);
      carList.get(id).setSpeed(speed);
    }

    return new ResponseEntity<>(car, HttpStatus.OK);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<Car> get(@PathVariable("id") int id) {
    return new ResponseEntity<>(carList.get(id), HttpStatus.OK);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<ArrayList<Car>> delete(@PathVariable("id") int id) {
	  carList.remove(id);

    return new ResponseEntity<>(carList, HttpStatus.OK);
  }

}
