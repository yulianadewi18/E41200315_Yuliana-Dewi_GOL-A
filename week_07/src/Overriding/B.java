/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author Yuliana Dewi
 */
public class B extends A {
    public void tampilkanKeLayar() {
        super.tampilkanKeLayar(); //memanggil method milik superclassnya
        System.out.println("Method milik Class B dipanggil");
    }
    
}
