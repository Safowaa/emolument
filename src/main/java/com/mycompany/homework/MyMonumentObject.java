/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author MissSafowaa
 */
public class MyMonumentObject {
    public static void main (String[] args){
        NumberFormat non =  NumberFormat.getCurrencyInstance();
        
        try{
        float BasicSalary = Float.parseFloat(JOptionPane.showInputDialog(null,"enter basic salary"));
        float TaxRelief = Float.parseFloat(JOptionPane.showInputDialog(null,"enter tax relief salary"));
        
        //creating instance of the child
        MyEmolument jane = new MyEmolument(BasicSalary,TaxRelief);
        JOptionPane.showMessageDialog(null, " Basic Salary = "+ non.format(BasicSalary) 
                                      +"\n Tax Relief = "+ non.format(TaxRelief) 
                                      +"\n SSNIT contribution = "+ non.format(jane.ssnit()) 
                                      +"\n Taxable Income = "+ non.format(jane.TaxableIncome()) 
                                      +"\n Icome Tax = "+ non.format(jane.IncomeTax())
                                      +"\n Total Deduction = "+ non.format(jane.totalDeduction())
                                      +"\n Net Salary = "+ non.format(jane.NetSalary()),"Staff emolument", JOptionPane.INFORMATION_MESSAGE);
        
        
    } 
        catch(Exception i){
        JOptionPane.showMessageDialog(null, "enter a valid input" + i.toString());


    }
    
}
}
    

