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
public class LABOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r,luas,keliling;
        
        System.out.println("r = ");
        r = new Scanner (System.in).nextDouble(); //seperti readln
        luas = 3.14 * r * r;
        keliling = 2*3.14*r;
        
        DecimalFormat koma = new DecimalFormat("#.##");
        System.out.println("=========================Hasil perhitungan================");
        System.out.println("Luas Lingkaran= " + koma.format(luas));
        System.out.println("Keliling Lingkaran = " + koma.format(keliling));
    }
    
}
