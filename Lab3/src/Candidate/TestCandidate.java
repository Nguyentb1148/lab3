package Candidate;

import java.util.Scanner;

public class TestCandidate {
    public static Candidate[] myArray = new Candidate[2];
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        while(true) {
            System.out.println("Here is a program which provides the following functionalies:");
            System.out.println("1. Input Cadidates.");
            System.out.println("2. How many the students pass?");
            System.out.println("3. Output the students pass on the screen.");
            System.out.println("4. Exit");
            System.out.println("Please tell us your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputCadidates();
                    break;
                case 2:
                    studentPass();
                    break;
                case 3:
                    isStudentPass();
                    break;
                case 4:
                    System.out.println("Goodbye. See you again");
                    return;
                case 5:
                    showStudent();
                default:
                    System.out.println("Invalid option");
            }
        }
    }
    public  static void inputCadidates()
    {
        System.out.println("How many cadidates?");
        int a=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            System.out.println("Student "+(i+1));
            myArray[i]=new Candidate();
            myArray[i].input(sc);
        }
    }
    public static void studentPass()
    {
        int a=0;
        for (int i=0;i< myArray.length;i++)
        {
            myArray[i].studentsPass(a);
        }
        System.out.println("Students pass: "+a);;
    }
    public static void showStudent()
    {
        for (int i=0;i<myArray.length;i++)
        {
            myArray[i].showStudent();
        }
    }
//    public  static void studentPass()
//    {
//        int j=0;
//        for (int i=0;i< myArray.length;i++)
//        {
//           if(myArray[i].averageMark>=5)
//           {
//               j++;
//           }
//        }
//        System.out.println("Students pass: "+j);
//    }
    public static void isStudentPass()
    {
        for (int i=0;i< myArray.length;i++)
        {
            myArray[i].showStudentsPass();
        }
    }
}
