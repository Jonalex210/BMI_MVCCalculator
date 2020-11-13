/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bmi_mvc;

/**
 *
 * @author Jonathan Njeunje
 */
public class MCVCalculator { 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theModel, theView);
        
        /* Create and display the form */
        theView.setVisible(true);

    }
}
