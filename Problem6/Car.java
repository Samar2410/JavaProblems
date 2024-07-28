/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem6;

/**
 *
 * @author samar
 */
public class Car implements IVehiculo {
int gasoline;
   
    

    @Override
    public void Drive() {
        System.out.println("Car is driving");
    }

    @Override
    public boolean Refuel(int gas) {
        if(gas>0){
            gasoline+=gas;
            return true;
        }
        return false;
        
    }
    
}
