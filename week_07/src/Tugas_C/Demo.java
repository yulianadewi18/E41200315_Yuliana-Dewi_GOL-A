/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_C;

/**
 *
 * @author Yuliana Dewi
 */
public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        Animal animaldog = new Dog();
        animaldog.makeNoise();
        
        if (animal instanceof Animal) {
            System.out.println("Animal is Animal");
        }
        
        if (dog instanceof Animal) {
            System.out.println("Dog is Animal");
        }
        
        if (animaldog instanceof Animal) {
            System.out.println("Animaldog is Animal");
        }
        
        if (animal instanceof Dog) {
            System.out.println("Animal is Dog");
        }
    }
    
}
