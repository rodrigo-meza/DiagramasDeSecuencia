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
        updateDisplay();

       
    }
    private static void updateDisplay(){
        System.out.println("Updating...");
    }
}
