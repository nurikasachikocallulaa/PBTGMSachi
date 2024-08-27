/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10soal2;

/**
 *
 * @author pc
 */
public class Pertemuan10soal2 {

    public static void main(String[] args) {
        Aritmatika aritmatika = new Aritmatika();
        
        int bilangan1 = 20;
        int bilangan2 = 10;
        
        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        double hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
        double hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);
        
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Pembagian: " + hasilPembagian);
        System.out.println("Hasil Pangkat: " + hasilPangkat);
    }
}
