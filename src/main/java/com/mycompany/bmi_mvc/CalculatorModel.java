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
public class CalculatorModel {
    
    private double BMI;
    
    public void calculateBMI(double heightFeet, double heightInches, double weight){
        BMI = (703*weight) / ((12*heightFeet+heightInches)*(12*heightFeet+heightInches));
    }
    
    public double getBMI(){
        return BMI;
    }
}
