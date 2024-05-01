/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionclass.tp5.Ex1;

/**
 *
 * @author user
 */
public class RandomForest extends BaseModel{
    
    private int numTrees ;
    private int maxDepth;

    public RandomForest(String randomForest, int i, int i0) {
        super(randomForest,1,"aighh","cup");
        this.maxDepth=i;
        this.numTrees=i0;
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
