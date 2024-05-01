/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionclass.tp5.Ex1;

/**
 *
 * @author user
 */
public class ClassificationDataset extends Dataset{
      private String[] labels;
      private int numClasses;
      
      

      public ClassificationDataset(String path,boolean isTrain){
            super.path=path;
            super.isTrain=isTrain;} 

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
