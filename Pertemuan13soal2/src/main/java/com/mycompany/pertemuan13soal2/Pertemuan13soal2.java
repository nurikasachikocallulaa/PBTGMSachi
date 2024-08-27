/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13soal2;

/**
 *
 * @author pc
 */
class Segitiga {
    public double hitungLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }
    public double hitungLuas(double sisiA, double sisiB, double tinggi) {
        double alas = (2 * sisiA) / sisiB;
        return (alas * tinggi) / 2;
    }
}

public class Pertemuan13soal2 {

    public static void main(String[] args) {
          Segitiga segitiga = new Segitiga();

        double luas1 = segitiga.hitungLuas(5.0, 8.0);
        System.out.println("Luas Segitiga (alas x tinggi / 2): " + luas1);
        double luas2 = segitiga.hitungLuas(4.0, 3.0, 6.0);
        System.out.println("Luas Segitiga (sisi x tinggi / 2): " + luas2);
    }
}
