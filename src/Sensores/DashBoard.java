/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sensores;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class DashBoard {
    public static void despliega_sensores(String[] args) {
        SensorProxy sp1 = new SensorProxy();
        SensorProxy sp2 = new SensorProxy();
        ArrayList<Sensor> sensores= new ArrayList();
        Sensor t1 = new Sensor();
        Sensor t2 = new Sensor();
        Sensor l1 = new Sensor();
        Sensor l2 = new Sensor();
        sensores.add(t1);
        sensores.add(t2);
        sensores.add(l1);
        sensores.add(l2);
        updateDisplay();
        for(Sensor s : sensores){
            s.read();
        }
       
    }
    private static void updateDisplay(){
        System.out.println("Updating...");
    }
}
