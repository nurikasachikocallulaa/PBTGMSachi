/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9soal1;

/**
 *
 * @author pc
 */
public class Pertemuan9soal1 {

    public static void main(String[] args) {
         int i = 1; // Variabel untuk baris

        while (i <= 5) {
            int j = 1; // Variabel untuk kolom pada setiap baris
            
            while (j <= i) {
                System.out.print("* ");
                j++;
            }

            System.out.println(); // Baris baru
            i++;
        }
    }
}
