package Point;

import java.util.Scanner;

public class Point {
    private double abscissa;
    private double ordinate;

    public Point() {
        this(0, 0);
    }


    public Point(double abscissa, double ordinate) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }

    public double getAbscissa() {
        return abscissa;
    }

    public void setAbscissa(double abscissa) {
        this.abscissa = abscissa;
    }

    public double getOrdinate() {
        return ordinate;
    }

    public void setOrdinate(double ordinate) {
        this.ordinate = ordinate;
    }

    public  void input(Scanner sc)
    {
        System.out.print("Enter the abscissa: ");
        this.abscissa=sc.nextDouble();
        System.out.print("Enter the ordinate: ");
        this.ordinate=sc.nextDouble();
    }

    public void display()
    {
        System.out.println(this);
    }
    public String toString()
    {
        return "("+abscissa+","+ordinate+")";
    }

    /**
     * @param other another point
     * @return
     */
    public double distance(Point other) {
        double x = Math.sqrt((this.abscissa - other.abscissa) * (this.abscissa - other.abscissa)
                + (this.ordinate - other.ordinate) * (this.ordinate - other.ordinate));
        //System.out.println("Distance between B and C is: " + x);
        return x;
    }
    /**
     * @param p1 First point
     * @param p2 Second point
     * @param p3 Last point
     * @return
     */
    public static double isTriangle(Point p1, Point p2, Point p3)
    {
        Double x = Math.sqrt((p1.abscissa - p2.abscissa) * (p1.abscissa - p2.abscissa)
                + (p1.ordinate - p2.ordinate) * (p1.ordinate - p2.ordinate));
        Double y = Math.sqrt((p2.abscissa - p3.abscissa) * (p2.abscissa - p3.abscissa)
                + (p2.ordinate - p3.ordinate) * (p2.ordinate - p3.ordinate));
        Double z = Math.sqrt((p1.abscissa - p3.abscissa) * (p1.abscissa - p3.abscissa)
                + (p1.ordinate - p3.ordinate) * (p1.ordinate - p3.ordinate));
        Double p=(x+y+z)/2;
        Double isTriangle=Math.sqrt(p*(p-x)*(p-y)*(p-z));
        //System.out.println("The area of a triangle Make by A,B,C point is: "+isTriangle);
        return isTriangle;
    }
}
