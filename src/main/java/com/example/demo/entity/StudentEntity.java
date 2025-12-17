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
    public void setName(string name){
        this.name=name;
    }
    public int getID(){
        return id;
    }
    public void setID(int ID){
        this.id=id;
    }
    public LocalDate getDate()
}