/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem7;

import java.util.Scanner;

/**
 *
 * @author samar
 */
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Dog d=new Dog();
        d.SetName(sc.next());
    
        System.out.println(d.GetName());
            d.Eat();
    }
}
