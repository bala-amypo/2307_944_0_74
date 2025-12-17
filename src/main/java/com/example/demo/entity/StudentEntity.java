package com.example.demo.entity;

Import java.time.LocalDate;

public class Studententity {
    private String name;
    private int id;
    private LocalDate date;
    private float cgpa;

    public Studententity(){

    }

    public Studententity(string name,int id,LocalDate date,float cgpa){
        this.name=name;
        this.id=id;
        this.date=date;
        this.cgpa=cgpa;
    }
    public string getName(){
        return name;
        
    }
}