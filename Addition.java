import java.io.*;
import java.util.*;
public class Addition extends Object{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int i1 = sc.nextInt();
        System.out.print("Enter second integer : ");
        int i2 = sc.nextInt();
        int i3 = i1+i2;
        System.out.println("The sum of "+i1+" and "+i2+" i1 "+i3+"");
    }
}
