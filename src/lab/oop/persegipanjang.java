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
public class persegipanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p,l,luas,keliling;
        
        System.out.println("Panjang = ");
        p =(int) new Scanner (System.in).nextInt(); //seperti readln
        System.out.println("Lebar = ");
        l = (int)   new Scanner (System.in).nextInt();
        luas = p * l;
        keliling = 2 * (p+l);
        
        System.out.println("=========================Hasil perhitungan================");
        System.out.println("Luas persegi panjang = " + luas);
        System.out.println("Keliling persegi panjang = " + keliling);
    }
    
}
