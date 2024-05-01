/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionclass.tp5.Ex1;

/**
 *
 * @author user
 */
public  class NeuralNetwork extends BaseModel {
    private int[] layers;
    private  String activationFunction;
    
    
    public NeuralNetwork( String name,int[] layers, String activationF) {
        super(name,1,"description", "cpu");
        this.activationFunction=activationF;
        this.layers=layers;
        
        
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
