/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionclass.tp5.Ex2;

/**
 *
 * @author user
 */
public class UserValidator {
    
    public void validateAge(int a) throws UserAgeException{
         if(a<18)  throw new UserAgeException(" Âge invalide :"+ a+". L’utilisateur doit être âgé de 18 ans ou plus.");
         
         
    }
}
