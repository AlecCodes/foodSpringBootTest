package com.learnspring.test.controller;
import com.learnspring.test.entity.food;
import com.learnspring.test.repository.foodRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class FoodController {

    public foodRepository FOODS;

    public FoodController(foodRepository FOODS){
        this.FOODS = FOODS;
    }

    @GetMapping("/food")
    public List<food> getFoods(){
        return FOODS.findAll();
    }

    @PostMapping("/food")
    public List<food> createFood(@RequestBody food newFood){
        FOODS.save(newFood);
        return FOODS.findAll();
    }
    @PutMapping("/food/{id}")
    public List<food> updateFood(@RequestBody food updatedFood, @PathVariable Integer id){
        FOODS.findById(id)
                .map(food -> {
                    food.setName(updatedFood.getName());
                    food.setCarbs(updatedFood.getCarbs());
                    food.setDate(updatedFood.getDate());
                });
    }

}
