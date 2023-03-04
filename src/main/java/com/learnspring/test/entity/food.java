package com.learnspring.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class food {
    @Id
    @GeneratedValue
    public Integer id;
    public String name;
    public Integer carbs;
    public String date;

    //Constructors
    public food(){

    }

    public food(String name, Integer carbs, String date){
        this.name = name;
        this.carbs = carbs;
        this.date = date;
    }

//  ID GETTER SETTER
    public Integer getId (){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    //  name GETTER SETTER

    public String getName (){
        return this.name;
    }

    public void setId(String name){
        this.name = name;
    }
    //  carbs GETTER SETTER

    public Integer getCarbs (){
        return this.carbs;
    }

    public void setCarbs(Integer carbs){
        this.carbs = carbs;
    }
    //  date GETTER SETTER

    public String getDate (){
        return this.date;
    }

    public void setString(String date){
        this.date = date;
    }
}
