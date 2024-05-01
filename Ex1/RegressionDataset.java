/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionclass.tp5.Ex1;

/**
 *
 * @author user
 */
public class RegressionDataset extends Dataset {
     private int numFeatures;
     private double [] targets;

    public RegressionDataset(String cheminversregression_datacsv, boolean b) {
         super.path=cheminversregression_datacsv;
          super.isTrain=b;}
     
     
     
     @Override
     public void ChargerData( String path){  // charger le data;

}
    
    /**
     *
     * @param path
     */
    @Override
    public void TraiterData(String path){// la prétraitement des données
} 
}
