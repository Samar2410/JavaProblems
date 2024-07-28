/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samar
 */
public class Problem5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> al = new ArrayList<>();
        Teacher t = new Teacher(sc.next());
        Student s1 = new Student(sc.next());
        Student s2 = new Student(sc.next());
        al.add(t);

        al.add(s1);
        al.add(s2);
        t.toString();
        t.Explain();

        s1.toString();
        s1.Study();
        s2.toString();
        s2.Study();

    }
}
