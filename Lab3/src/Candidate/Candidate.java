package Candidate;


import java.util.Scanner;

public class Candidate{
    private static int numberStudents =0;
    private  int codeId;
    private String name;
    private int yearOfBirth;
    private double testMark1;
    private double testMark2;
    private double testMark;

//    public Candidate(int codeId,String name, int yearOfBirth,int testMark1,int testMark2,int testMark)
//    {
//        this.codeId=codeId;
//        this.name = name;
//        this.yearOfBirth=yearOfBirth;
//        this.testMark1 = testMark1;
//        this.testMark2 = testMark2;
//        this.testMark = testMark;
//    }

    public Candidate() {

    }


//    public int getCodeId() {
//        return codeId;
//    }
//
//    public void setCodeId(int codeId) {
//        this.codeId = codeId;
//    }
//
//    public String getname() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getYeafBirth() {
//        return yearOfBirth;
//    }
//
//    public void setYearOfBirth(int yearOfBirth) {
//        this.yearOfBirth = yearOfBirth;
//    }
//
//    public double gettestMark1() {
//        return testMark1;
//    }
//
//    public void setTestMark1(double testMark1) {
//        this.testMark1 = testMark1;
//    }
//
//    public double gettestMark2() {
//        return testMark2;
//    }
//
//    public void setTestMark2(double testMark2) {
//        this.testMark2 = testMark2;
//    }
//
//    public double gettestMark() {
//        return testMark;
//    }
//
//    public void setTestMark(double testMark) {
//        this.testMark = testMark;
//    }



    public void input(Scanner sc) {
        System.out.print("Input codeId of Student:");
        this.codeId = sc.nextInt();
        System.out.print("Input the name of Student:");
        this.name = sc.next();
        System.out.print("Input year of birth of Student:");
        this.yearOfBirth = sc.nextInt();
        System.out.print("Input test mark 1 of Student:");
        this.testMark1 = sc.nextDouble();
        System.out.print("Input test mark 2 of Student:");
        this.testMark2 = sc.nextDouble();
        System.out.print("Input test mark of Student:");
        this.testMark = sc.nextDouble();
    }
    public void displayInformation(){
        String classification;
        Double averageGrade=this.isAverageMark();
        if (averageGrade>8) classification = "Good";
        else if( averageGrade<8 && averageGrade>=7) classification = "Fairly good";
        else if( averageGrade<7 && averageGrade>=5) classification = "Average";
        else classification = "Fail";
        System.out.printf("%-15s %-15.2f%-15s\n",name,averageGrade,classification);
    }

    public double isAverageMark()
    {
        return (((testMark1 + testMark2) /2 + testMark * 2)) / 3;
    }


//    public void studentsPass(){
//        System.out.println("Students pass: "+isStudentPass());
//    }

    public void showStudentsPass()
    {
        String classification;
        Double averageGrade=this.isAverageMark();
        if (averageGrade>8) classification = "Good";
        else if( averageGrade<8 && averageGrade>=7) classification = "Fairly good";
        else if (averageGrade < 7 && averageGrade >= 5){classification = "Average";}
        else  return ;
        System.out.printf("%-15s %-15.2f%-15s\n",name,averageGrade,classification);
    }

    public void showStudent()
    {
        System.out.println(codeId);
        System.out.println(name);
        System.out.println(yearOfBirth);
        System.out.println(testMark1);
        System.out.println(testMark2);
        System.out.println(testMark);
        System.out.println(isAverageMark());
    }
}
