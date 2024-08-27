/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11soal2;
import java.util.Scanner;
/**
 *
 * @author pc
 */
class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private int golongan;
    private String jabatan;
    private double gajiPokok;
    public Karyawan(String idKaryawan, String namaKaryawan, int golongan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.golongan = golongan;
        switch (golongan) {
            case 1:
                this.jabatan = "Assisten Staff";
                this.gajiPokok = 3000000;
                break;
            case 2:
                this.jabatan = "Staff";
                this.gajiPokok = 3500000;
                break;
            case 3:
                this.jabatan = "Supervisor";
                this.gajiPokok = 4000000;
                break;
            case 4:
                this.jabatan = "Assisten Manager";
                this.gajiPokok = 5000000;
                break;
            case 5:
                this.jabatan = "Manager";
                this.gajiPokok = 6000000;
                break;
            default:
                this.jabatan = "Unknown";
                this.gajiPokok = 0;
                System.out.println("Golongan tidak dikenal. Harap periksa input.");
                break;
        }
    }
    public void tampilkanDataKaryawan() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
public class Pertemuan11soal2 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Karyawan: ");
        String idKaryawan = input.nextLine();

        System.out.print("Masukkan Nama Karyawan: ");
        String namaKaryawan = input.nextLine();

        System.out.print("Masukkan Golongan (1, 2, 3, 4, 5): ");
        int golongan = input.nextInt();
        Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, golongan);

        System.out.println("\nData Karyawan:");
        karyawan.tampilkanDataKaryawan();
    }
}
