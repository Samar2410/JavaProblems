/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem7;

import javax.xml.stream.events.Namespace;

/**
 *
 * @author samar
 */
public abstract class Animal {
    String Name;
    void SetName(String name){
        Name =name;
    }
    String GetName(){
        return Name;
    }
    abstract void Eat();
}
