package Point;

import Point.Point;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfPoints {
    public static Point[] myArray = new Point[10];
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        inputTenPoints();
        System.out.println();
        largestDistance();
        System.out.println();
        largestTriangle();
    }

    public static void inputTenPoints()
    {
        for (int i=0;i<10;i++)
        {
            System.out.print("Point number"+(i+1));
            System.out.println();
            myArray[i]=new Point();
            myArray[i].input(sc);
        }
    }
    public static void  largestDistance()
    {
        double max=-1;
        int a=-1,b=-1;
        for (int i=0;i<myArray.length-1;i++)
        {
            for (int j=0;j<myArray.length;j++)
            {
                if(myArray[i].distance(myArray[j])>max)
                {
                    max = myArray[i].distance(myArray[j]);
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println("Maximum distance of two Points is :"+max+" of two Points "+myArray[a]+" and "+myArray[b]);
    }
    public static void  largestTriangle()
    {
        double max=-1;
        int a=-1,b=-1,c=-1;
        for (int i=0;i<myArray.length;i++)
        {
            for (int j=0;j<myArray.length-1;j++)
            {
                for (int k=0;k<myArray.length-2;k++)
                {
                    if(Point.isTriangle(myArray[i],myArray[j],myArray[k])>max)
                    {
                        max = Point.isTriangle(myArray[i],myArray[j],myArray[k]);
                        a = i;
                        b = j;
                        c = k;
                    }
                }
            }
        }
        System.out.println("Maximum area of triangle is :"+max+" of three Points "+myArray[a]+", "+myArray[b]+" and "+myArray[c]);
    }
}
