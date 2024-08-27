/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan14soal2;
// Kelas abstrak
abstract class AbstrakHewan {
    
    public abstract void suara();
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}
class Kucing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Meow");
    }
}
class Anjing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Woof");
    }
}
class Burung extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Mencicit");
    }
}
/**
 *
 * @author pc
 */
public class Pertemuan14soal2 {

    public static void main(String[] args) {
        AbstrakHewan burung = new Burung();
        
        // Memanggil metode dari objek Burung
        System.out.print("Suara Burung ");
        burung.suara();  // Output: Mencicit
    }
}
