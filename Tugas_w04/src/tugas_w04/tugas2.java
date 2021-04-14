/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_w04;

/**
 *
 * @author Yuliana Dewi
 */
public class tugas2 {
     public static void main(String[] args) {
        // TODO code application logic here
         int number = 1;

        System.out.println("         Do_While");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("============================");
        int i = 1;
        do {
            System.out.print(i*2 + " ");
            i++;
        }
        while (i<=50);
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("     Perkalian 2 (1-100)");
        System.out.println("============================");
        System.out.print("     " + number + " ");
        do {
            number *= 2;
            if (number > 100){
                break;
            }
            System.out.print(number + " ");
        } while (number < 100);
        System.out.println("");
    }
    
}
