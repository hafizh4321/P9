/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.oop;

import java.util.Scanner;

/**
 *
 * @author Hafizh
 */
public class Kubus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double s,volume;
        
        System.out.println("Sisi = ");
        s =new Scanner (System.in).nextDouble(); //seperti readln
       
      
        volume = s * s * s;
       
        
        System.out.println("=========================Hasil perhitungan================");
        System.out.println("Volume kubus = " + volume);
     
    }
    
}
