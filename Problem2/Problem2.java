package Problem2;


import Problem1.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author samar
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Person> al=new ArrayList<>();
        for(int i=0;i<3;i++){
            String name=sc.next();
            al.add(new Person(name));
            
        }
        
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i).toString());
        }
        
    }
    
}
