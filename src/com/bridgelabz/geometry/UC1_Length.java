package com.bridgelabz.geometry;

public class UC1_Length
{
    public static void main(String[] args)
    {
        // point 1
        double x1 = 1;
        double y1 = 1;

        // point 2
        double x2 = 5;
        double y2 = 5;

        // Calculate distance between two points
        double length = Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2 );



        System.out.println("Length of Line is :" + length);
    }
}
