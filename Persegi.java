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
public class Persegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nilai = new Scanner (System.in);
        int s,luas,keliling;
        
        System.out.println("sisi = ");
        s = nilai.nextInt(); //seperti readln
        luas = s * s;
        keliling = 4 * s;
        
        System.out.println("=========================Hasil perhitungan================");
        System.out.println("Luas persegi = " + luas);
        System.out.println("Keliling persegi = " + keliling);
    }
    
}
