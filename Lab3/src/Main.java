
public class Main {
    public static void main(String[]args)
    {
        int c   = 5, d = 7;
        swap(c,d);
        System.out.println("c = "+c);
    }
    public static void swap(int a, int b)
    {
     int c = a;
     a = b;
     b = c;
    }
}
