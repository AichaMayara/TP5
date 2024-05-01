/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionclass.tp5.Ex2;

import java.io.FileNotFoundException;

/**
 *
 * @author user
 */
public class FileManager {
    
    
    public void readFile(String path) throws  FileNotFoundException {
       if(path==null) throw new FileNotFoundException("Fichier non trouvé : "+path);
    
    
    
    }
    
    
}
