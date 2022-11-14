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

//    class encalpsulated
public class emolument {
    
//    default constructor
    protected double basic_salary;
    protected double tax_relief;
    
    public emolument(){
    basic_salary = 0;
    tax_relief = 0;
    }

//    data fields
    public emolument(double basic_salary, double tax_relief){
    this.basic_salary = basic_salary;
    this.tax_relief = tax_relief;
    
    }
    
//    method basic salary
    double getBasicsalary (){
    return basic_salary ;
    }
    
//    method basic salary
    double getTaxRelief (){
    return tax_relief;
    }
    
//    method SSNIT
    double ssnit(){
    return (getBasicsalary() * 0.035);
    }
    
    double TaxableIncome(){
    return getBasicsalary() - (getTaxRelief() + ssnit());
    }
}
