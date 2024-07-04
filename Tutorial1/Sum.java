import java.io.*;
import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        int a,b,c;
        System.out.println("Enter Two Numbers:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("Sum is:" + c);

    }
}