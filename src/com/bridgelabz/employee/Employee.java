package com.bridgelabz.employee;

public class Employee
{
    private static double EmpCheck=Math.floor(Math.random()*10) % 2;
    public static void main(String[] args)
    {
        check_present_absent();
    }
    public static void check_present_absent()
    {
        int IS_FULL_TIME=1;
        if(EmpCheck==IS_FULL_TIME)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}
