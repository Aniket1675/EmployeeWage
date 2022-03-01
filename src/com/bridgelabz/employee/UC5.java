package com.bridgelabz.employee;

public class UC5
{
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int emp_per_hour=20;
    public static final int working_day=2;


    public static void main(String[] args)
    {
        int emp_hour=0;
        int emp_wage=0;
        int total_emp_wage=0;

        for(int day=0;day < working_day;day++)
        {
            int empcheck=(int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck)
            {
                case IS_FULL_TIME:
                    emp_hour=8;
                    break;

                case IS_PART_TIME:
                    emp_hour=4;
                    break;

                default:
                    emp_hour=0;
            }

            emp_wage=emp_hour * emp_per_hour;
            total_emp_wage += emp_wage;
            //System.out.println("Employee Wage"+emp_wage);

        }
        System.out.println("Total Employee Wage"+total_emp_wage);
    }
}
