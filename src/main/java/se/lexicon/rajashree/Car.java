package se.lexicon.rajashree;

import java.util.HashMap;
import java.util.Map;

public class Car {
    private Integer id;
    private String car;
    private String model;




    public Car(String car) {
        //this.car = car;
        setCar(car);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public static void main(String[] args) {
        HashMap<Integer,Object> hascar= new HashMap <Integer,Object>();
        hascar.put(001,new Car("AUDI"));
        hascar.put(002,new Car("BMW"));
        hascar.put(003,new Car("TOYOTA"));
        hascar.put(004,new Car("VOLVO"));
        hascar.put(005,new Car("KIA"));


        for (Object obj : hascar.values()) {
            System.out.println(" question no 12  value: " + hascar.get(obj));
        }
    }






}
