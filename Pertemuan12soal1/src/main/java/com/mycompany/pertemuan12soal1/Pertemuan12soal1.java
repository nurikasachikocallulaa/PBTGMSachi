/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan12soal1;

/**
 *
 * @author pc
 */
class Karyawan {
    String id;
    String nama;
    String jabatan;
    double gajiPokok;
    double tunjanganMakan;
    double tunjanganTransport;

    public Karyawan(String id, String nama, String jabatan, double gajiPokok, double tunjanganMakan, double tunjanganTransport) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.tunjanganMakan = tunjanganMakan;
        this.tunjanganTransport = tunjanganTransport;
    }
}

class KaryawanTetap extends Karyawan {
    double bonus;


    public KaryawanTetap(String id, String nama, String jabatan, double gajiPokok, double tunjanganMakan, double tunjanganTransport, double bonus) {
        super(id, nama, jabatan, gajiPokok, tunjanganMakan, tunjanganTransport);
        this.bonus = bonus;
    }
    public double hitungGajiTotal() {
        return gajiPokok + bonus + tunjanganMakan + tunjanganTransport;
    }

    public void cetakDetailGaji() {
        System.out.println("Gaji " + jabatan + " : " + gajiPokok);
        System.out.println("Bonus : " + bonus);
        System.out.println("Tunjangan Makan : " + tunjanganMakan);
        System.out.println("Transport : " + tunjanganTransport);
        System.out.println("Gaji Total : " + hitungGajiTotal());
    }
}
public class Pertemuan12soal1 {

    public static void main(String[] args) {
        KaryawanTetap karyawan1 = new KaryawanTetap("001", "Budi", "System Analyst", 4000000, 400000, 500000, 1000000);

        karyawan1.cetakDetailGaji();
    }
}
