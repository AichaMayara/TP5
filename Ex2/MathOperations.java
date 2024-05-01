/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionclass.tp5.Ex2;

/**
 *
 * @author user
 */
public class MathOperations {
    
    
    public  int  calculateFactorial(int n) throws IllegalArgumentException{
    
       if(n<0)throw new IllegalArgumentException("Factorial is undefined for negative numbers :"+ n);
       
              int factorial = 1;
              for (int i = 1; i <= n; i++) {
               factorial *= i;
                             }
                  return factorial;
                  }
    
    
    public double calculateSquareRoot(int n1) throws ArithmeticException{
         if( n1<0) throw new ArithmeticException(" Tentative de calcul de la racine carrée d’un nombre négatif :"+n1);
           return Math.sqrt(n1);           }
    }

