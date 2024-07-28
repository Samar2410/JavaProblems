/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem8;

import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author samar
 */
public class Problem8 {

    public static void main(String[] args) {
        int ch;
        System.out.println("Please enter a choice :\n 1. Add employee \n 2. Update Employee \n 3. Delete Employee \n 4. List Employees \n 5. Exit");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        while (true) {
            
            if (ch == 1) {
                System.out.println("Enter employee name: ");
                String name = sc.next();
                System.out.println("Enter employee salary: ");
                double sal = sc.nextDouble();
                System.out.println("Enter employee gender: ");
                String gen = sc.next();
                try {
                    ResultSet rs = DBLoader.executeQuery("select * from employee");
                    rs.moveToInsertRow();
                    rs.updateString("EmpName", name);
                    rs.updateDouble("EmpSalary", sal);
                    rs.updateString("EmpGender", gen);
                    rs.insertRow();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (ch == 2) {

                System.out.println("Choose what to update: \n 1. Name \n 2. Salary \n 3. Gender");
                int cho;
                cho = sc.nextInt();
                System.out.println("Enter employee id to be updated:");
                int id = sc.nextInt();
                try {
                    ResultSet rs = DBLoader.executeQuery("select * from employee where EmpID =" + id);
                    if (rs.next()) {
                        if (ch == 1) {
                            System.out.println("Enter new name:");
                            String name=sc.next();
                            rs.updateString("EmpName", name);

                        } else if (ch == 2) {
                            System.out.println("Enter new salary:");
                            double sal=sc.nextDouble();
                            rs.updateDouble("EmpSalary", sal);

                        } else if (ch == 3) {
                                System.out.println("Enter new gender:");
                            String gen=sc.next();
                            rs.updateString("EmpGender", gen);
                        } else {
                            System.out.println("Invalid choice");
                        }

                    } else {
                        System.out.println("Invalid employee id");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (ch == 3) {
                System.out.println("Enter employee id to be deleted:");
                int id = sc.nextInt();
                try {
                    ResultSet rs = DBLoader.executeQuery("select * from employee where EmpID =" + id);
                    if (rs.next()) {
                        rs.deleteRow();

                    } else {
                        System.out.println("Invalid employee id");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (ch == 4) {
                String ans = "EmpID | EmpName         | EmpSalary      | EmpGender\n";
                try {
                    ResultSet rs = DBLoader.executeQuery("select * from employee");
                    
                    while (rs.next()) {
                        int eid = rs.getInt("EmpID");
                        String name = rs.getString("EmpName");
                        double sal = rs.getDouble("EmpSalary");
                        String gen = rs.getString("EmpGender");
                        ans += eid + "     " + name + "              " + sal + "       " + gen + "\n";
                        
                    }

                    System.out.println(ans);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (ch == 5) {
                System.out.println("Exiting");
                break;
            } else {
                System.out.println("Invalid choice");
            }
            System.out.println("Enter choice:");
            ch = sc.nextInt();
        }
    }
}
