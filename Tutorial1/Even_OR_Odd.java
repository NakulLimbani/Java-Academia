import java.io.*;
import java.util.*;
class Even_OR_Odd
{
    public static void main(String args[])
    {
        int a;
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a>0)
        {
            if(a%2 == 0)
            {
                System.out.println("Given Number Is Even!");
            }
            else
            {
                System.out.println("Given Number is Odd!");
            }
        }
        else
        {
            System.out.println("Enter A Number Greater Than Zero!");
        }
    }
}