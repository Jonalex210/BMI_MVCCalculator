/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bmi_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jonathan Njeunje
 */
public class CalculatorController {
    
    private CalculatorModel theModel;
    private CalculatorView theView;
    
    public CalculatorController(CalculatorModel theModel, CalculatorView theView){
        this.theModel = theModel;
        this.theView = theView;
        
        this.theView.addjButtonCalculateBMI(new jButtonCalculateBMIListener());
    }

    private class jButtonCalculateBMIListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            theModel.calculateBMI(theView.getHeightFeet(), theView.getHeightInches(), theView.getWeight());
            theView.setBMI(theModel.getBMI());
        }
    }
    
}
