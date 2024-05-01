/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionclass.tp5.Ex1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 *
 * @author user
 */
public abstract class BaseModel implements MachineLearningModel{
    
     protected String name;
     private int version;
     private String description;
     private String device;
    
    public  BaseModel(String name,int version,String description,String device){
    this.name=name;
    this.version=version;
    this.description=description;
    this.device= device;}
    
    
    public  void displayDetails(){
       System.out.println("Name de model="+this.name+"de version ="+this.version+"la description ="+this.description+"device="+this.device);
    
    }
    
    
    
    
    
    

  
    
}
