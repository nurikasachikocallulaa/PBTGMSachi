/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan15soal1;

/**
 *
 * @author pc
 */
public class Kalkulator {
    // Method untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk pembagian
    public float pembagian(float a, float b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
            return 0;
        }
        return a / b;
    }

    // Method untuk perkalian
    public float perkalian(float a, float b) {
        return a * b;
    }
}
