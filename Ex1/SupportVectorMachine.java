/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionclass.tp5.Ex1;

/**
 *
 * @author user
 */
public class SupportVectorMachine extends BaseModel {
    
    private int iterations;
    private double learningRate;

    public SupportVectorMachine(String name, int v, double Rate) {
        super(name,v,"aidf","cup");
        this.learningRate=Rate;
    }
    
     

   

    @Override
    public void train(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double predict(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
    
    
    
    }
    

