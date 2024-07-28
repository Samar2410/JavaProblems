package Problem3;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samar
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person p=new Person();
        p.Greet();
        
        Student student1=new Student();
        student1.Greet();
        student1.setAge(21);
        student1.ShowAge();
        student1.Study();
        
        Teacher teacher1=new Teacher();
        teacher1.Greet();
        teacher1.Explain();
        
        
    }
}
