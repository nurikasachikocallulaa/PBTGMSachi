/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13soal1;

/**
 *
 * @author pc
 */
class Kalkulator {
    
    public int operasi(int a, int b) {
        return a + b;
    }
    public int operasi(int a, int b, String operasi) {
        if (operasi.equals("kurang")) {
            return a - b;
        }
        return 0;
    }
    public int operasi(int a, int b, double operasi) {
        return a * b;
    }
    public int operasi(double a, double b) {
        return (int) (a / b);
    }
}
public class  Pertemuan13soal1 {

    public static void main(String[] args) {
         Kalkulator kalkulator = new Kalkulator();

        int hasilTambah = kalkulator.operasi(20, 10);
        int hasilKurang = kalkulator.operasi(20, 10, "kurang");
        int hasilKali = kalkulator.operasi(20, 10, 2.0);
        int hasilBagi = kalkulator.operasi(20.0, 10.0);

        System.out.println("Hasil Pertambahan : " + hasilTambah);
        System.out.println("Hasil Pengurangan : " + hasilKurang);
        System.out.println("Hasil Perkalian : " + hasilKali);
        System.out.println("Hasil Pembagian : " + hasilBagi);
    }
}
