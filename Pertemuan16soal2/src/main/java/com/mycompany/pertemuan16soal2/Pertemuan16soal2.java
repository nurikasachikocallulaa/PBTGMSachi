/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16soal2;

/**
 *
 * @author pc
 */
class OperasiAritmatika {
    protected double A = 9.5;
    protected double B = 2.5;

    protected double hitung() {
        return 0;
    }
}
class Penjumlahan extends OperasiAritmatika {
    @Override
    protected double hitung() {
        return A + B;
    }
}
class Pengurangan extends OperasiAritmatika {
    @Override
    protected double hitung() {
        return A - B;
    }
}
class Perkalian extends OperasiAritmatika {
    @Override
    protected double hitung() {
        return A * B;
    }
}
class Pembagian extends OperasiAritmatika {
    @Override
    protected double hitung() {
        return A / B;
    }
}
public class Pertemuan16soal2 {

    public static void main(String[] args) {
        OperasiAritmatika[] operasi = {
            new Penjumlahan(),
            new Pengurangan(),
            new Perkalian(),
            new Pembagian()
        };

        System.out.println("Penjumlahan: " + operasi[0].hitung());
        System.out.println("Pengurangan: " + operasi[1].hitung());
        System.out.println("Perkalian: " + operasi[2].hitung());
        System.out.println("Pembagian: " + operasi[3].hitung());
    }
}
