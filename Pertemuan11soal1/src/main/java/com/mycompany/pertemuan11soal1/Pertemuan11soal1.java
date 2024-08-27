/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11soal1;

/**
 *
 * @author pc
 */

class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private String golongan;
    private String jabatan;
    private double gajiPokok;

    public Karyawan(String idKaryawan, String namaKaryawan, String golongan, String jabatan, double gajiPokok) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    public void tampilkanInfo() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
public class Pertemuan11soal1 {

    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("0001", "Bagas", "A", "Manager", 3000000.0);
        Karyawan karyawan2 = new Karyawan("0002", "Dinda", "B", "Staff", 3500000.0);

        System.out.println("Informasi Karyawan 1:");
        karyawan1.tampilkanInfo();

        System.out.println("\nInformasi Karyawan 2:");
        karyawan2.tampilkanInfo();
    }
}
