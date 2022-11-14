/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework;

/**
 *
 * @author MissSafowaa
 */
public class MyEmolument extends emolument{
    
//incalpsulation
    protected double basic_salary;
    protected double tax_relief;

    public MyEmolument(double BasicSalary, double TaxRelief){
        
        super(BasicSalary, TaxRelief);
        
        
    }
    

    public MyEmolument(){
        basic_salary = 0;
        tax_relief = 0;
    }
    
     double IncomeTax(){
        double taxRate;
        if(TaxableIncome()<=500){
           taxRate =(TaxableIncome()*0.5);
        }
        else if(TaxableIncome()<=500 && TaxableIncome()<=1000){
            taxRate = (TaxableIncome()*0.5)+(TaxableIncome()*1.25);
        }
        else 
            taxRate = (TaxableIncome()*0.5)+(TaxableIncome()*1.25)+(TaxableIncome()*1.75);
      return taxRate;
        
    }
     double totalDeduction(){
        //double TD = SSNIT()+IncomeTax();
        return ssnit()+ IncomeTax() ;
    }
     double NetSalary(){
        return basic_salary - totalDeduction();
    }


    
}

