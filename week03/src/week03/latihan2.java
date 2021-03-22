/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week03;

import java.util.Arrays;

/**
 *
 * @author Yuliana Dewi
 */
public class latihan2 {
    public static void main(String[] args) {
        int [] angka = {8, 9, 1, 2, 3};
        String[] teks = {"saya","ingin","menjadi","Programer"};
        
        for(int i=0; i<angka.length; i++){
            System.out.println(angka[i]);
        }
        
        for(int j=0; j<angka.length; j++){
            System.out.print(Arrays.toString(teks));
            System.out.print(" ");
        }
    }
}