/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119062.naufalrafipratama.pkg6;

/**
 *
 * @author 
 * Nama : Naufal Rafi Pratama
 * NIM  : 10119062
 * Kelas : IF-2
 * Tanggal : 20/02/2021
 * Nomor Soal : 6 
 */
public class UASIF210119062NAUFALRAFIPRATAMA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7.0);
        kalkulator.setValue2(5.0);

        System.out.println("Value 1 = " + kalkulator.getValue1());
        System.out.println("Value 2 = " + kalkulator.getValue2());
        System.out.println("Hasil Perkalian = " + kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
    
    }
    
}
