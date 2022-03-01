package com.bridgelabz.employee;

public class UC2
{
    public static void main(String[] args)
    {
        int IS_FULL_TIME=1;
        int emp_per_hour=20;
        int emp_hour=0;
        int emp_wage=0;
        double empcheck = Math.floor(Math.random()*10) % 2;
        if(empcheck==IS_FULL_TIME)
        {
            emp_hour=8;
        }
        else
        {
            emp_hour=0;
        }
        emp_wage=emp_hour*emp_per_hour;
        System.out.println("Employee Wage"+ emp_wage);
    }
}
