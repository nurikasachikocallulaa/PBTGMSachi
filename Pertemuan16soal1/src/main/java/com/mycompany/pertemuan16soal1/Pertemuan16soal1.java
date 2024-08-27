/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16soal1;

/**
 *
 * @author pc
 */
abstract class OperasiAritmatika {
    protected double A = 9.5;
    protected double B = 2.5;

    protected abstract double penjumlahan();
    protected abstract double pengurangan();
    protected abstract double perkalian();
    protected abstract double pembagian();
}
class Kalkulator extends OperasiAritmatika {

    @Override
    protected double penjumlahan() {
        return A + B;
    }

    @Override
    protected double pengurangan() {
        return A - B;
    }

    @Override
    protected double perkalian() {
        return A * B;
    }

    @Override
    protected double pembagian() {
        return A / B;
    }
}
public class Pertemuan16soal1 {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("Penjumlahan: " + kalkulator.penjumlahan());
        System.out.println("Pengurangan: " + kalkulator.pengurangan());
        System.out.println("Perkalian: " + kalkulator.perkalian());
        System.out.println("Pembagian: " + kalkulator.pembagian());
    }
}
