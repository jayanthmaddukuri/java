import java.io.*;
class OuterClass
{
    static int Outer_x = 10;
    int Outer_y = 20;
    private static int Outer_z = 30;
    static class StaticNestedClass
    {
        void display()
        {
            System.out.println("Outer_x value is "+Outer_x);
            System.out.println("Outer_z value is "+Outer_z);
            OuterClass out = new OuterClass();
            System.out.println("Outer_y value is "+out.Outer_y);
        }
    }
}
public class StaticNestedClassDemo
{
    public static void main(String args[])
    {
        OuterClass.StaticNestedClass snc = new OuterClass.StaticNestedClass();
        snc.display();
    }
