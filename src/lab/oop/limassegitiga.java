/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.oop;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Hafizh
 */
public class limassegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,t,ts,volume;
        
        System.out.println("Tinggi limas segitiga = ");
        t = new Scanner (System.in).nextDouble();
        System.out.println("Alas segitiga = ");
        a = new Scanner (System.in).nextDouble();
        System.out.println("Tinggi segitiga = ");
        ts = new Scanner (System.in).nextDouble();
        volume =  a*ts/2 * t/3;
        DecimalFormat koma = new DecimalFormat("#.##");
       
        System.out.println("=========================Hasil perhitungan================");
        System.out.println("Volume limas = " + koma.format(volume));
    }
    
}
