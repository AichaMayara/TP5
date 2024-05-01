/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionclass.tp5.Ex2.ETP5;

import com.gestionclass.tp5.Ex2.FileManager;
import com.gestionclass.tp5.Ex2.MathOperations;
import com.gestionclass.tp5.Ex2.UserAgeException;
import com.gestionclass.tp5.Ex2.UserValidator;
import java.io.FileNotFoundException;

/**
 *
 * @author user
 */
public class ETP5 {
    public static void main(String[] args) throws com.gestionclass.tp5.Ex2.IllegalArgumentException, com.gestionclass.tp5.Ex2.ArithmeticException {
 FileManager fileManager = new FileManager();
 MathOperations mathOperations = new MathOperations();
 UserValidator userValidator = new UserValidator();
 try {
 fileManager.readFile("invalid/file/path.txt");
 } catch (FileNotFoundException e) {
 System.out.println("Exception attrapée : " + e.getMessage());
 }
 try {
 mathOperations.calculateFactorial(-5);
 } catch (IllegalArgumentException e) {
 System.out.println("Exception attrapée : " + e.getMessage());
 }
 try {
 mathOperations.calculateSquareRoot(-10);
 } catch (ArithmeticException e) {
 System.out.println("Exception attrapée : " + e.getMessage());
 }
 try {
 userValidator.validateAge(16);
 } catch (UserAgeException e) {
 System.out.println("Exception attrapée : " + e.getMessage());
 }
 }

}
