/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan10soal1;

/**
 *
 * @author pc
 */
public class Aritmatika {
     public int pengurangan(int a, int b) {
        return a - b;
    }
    public int perkalian(int a, int b) {
        return a * b;
    }
    public int pembagian(int a, int b) {
    
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol");
        }
        return a / b;
    }
    public int pangkat(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
