package com.bridgelabz.employee;

public class UC6
{
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int emp_per_hour=20;
    public static final int working_day=2;
    public static final int max_hour=10;

    public static void main(String[] args)
    {
        int emp_hour=0;
        int emp_total_hour=0;
        int total_work_day=0;

        while (emp_total_hour <= max_hour && total_work_day < working_day )
        {
            total_work_day++;
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
             emp_total_hour +=emp_hour;
            System.out.println("Day"+total_work_day +"Employee Hour"+emp_hour);

        }
        int total_emp_wage=emp_total_hour * emp_per_hour;
        System.out.println("total employee wage"+total_emp_wage);

    }
}
