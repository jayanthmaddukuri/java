import java.io.*;
class Student
{
    int Rollno;
    String Name;
    float Fee;
    Student(int Rollno,String Name,float Fee)
    {
       this.Rollno = Rollno;
       this.Name = Name;
       this.Fee = Fee;
    }
    void display()
    {
        System.out.println("student details are ");
        System.out.println(Rollno+" " +Name+" "+Fee);
    }
}
 public class ThisDemo1
{
    public static void main(String args[])
    {
        Student s1 = new Student(4239,"Jayanth",45700);
        Student s2 = new Student(4204,"Ajay",47500);
        s1.display();
        s2.display();
    }
}    
