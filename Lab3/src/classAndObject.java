
public class classAndObject {
    public static void main(String[]args) {
        Student student1 = new Student("nguuen",7,8,9);
        System.out.println(Student.getNumberOfStudent());
        Student student2 = new Student("Hoa", 10, 6, 9);
        System.out.println(Student.getNumberOfStudent());
        Student student3 = new Student("Lan", 3, 5, 4);
        System.out.println(Student.getNumberOfStudent());
        Student student4 = new Student("Hung", 10, 8, 9);
        System.out.println(Student.getNumberOfStudent());
        Student student5 = new Student("nguen", 10, 8, 9);
        Student[] myStudentArray = new Student[5];
        myStudentArray[0] = student1;
        myStudentArray[1] = student2;
        myStudentArray[2] = student3;
        myStudentArray[3] = student4;
        myStudentArray[4] = student5;
        System.out.printf("%-15s %-15s%-15s\n","Name","Average Score","Classification");
        for (int i= 0;i<myStudentArray.length;i++){
            myStudentArray[i].displayInformation();
        }
    }
}
