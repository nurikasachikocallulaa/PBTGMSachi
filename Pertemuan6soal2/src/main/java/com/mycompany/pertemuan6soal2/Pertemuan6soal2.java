/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6soal2;

/**
 *
 * @author pc
 */
public class Pertemuan6soal2 {

    public static void main(String[] args) {
        
         // Input
        String[] NIM = {"1111", "1112"};
        String[] NAMA = {"Agustav", "Indah"};
        int[] NILAI = {85, 75};

        // Output
        for (int i = 0; i < NIM.length; i++) {
            String grade = determineGrade(NILAI[i]);
            String keterangan = determineKeterangan(grade);

            System.out.println("NIM   ? : " + NIM[i]);
            System.out.println("NAMA  ? : " + NAMA[i]);
            System.out.println("NILAI ? : " + NILAI[i]);
            
            System.out.println("Grade: " + grade);
            System.out.println("Keterangan: " + keterangan);
            System.out.println();
        }
    }

    public static String determineGrade(int nilai) {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 65) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public static String determineKeterangan(String grade) {
        if (grade.equals("A") || grade.equals("B") || grade.equals("C")) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}
