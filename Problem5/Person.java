package Problem5;

import Problem1.*;

/**
 *
 * @author samar
 */
public class Person {
    String Name;

    public Person(String p) {
        Name=p;
    }

   
    @Override
    public String toString(){
        return "Hello! My name is "+Name;
    }
}
