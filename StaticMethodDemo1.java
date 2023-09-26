class Student {
    int rollno;
    String name;
    static String collage = "SITE";

    static void changecollage() {
        collage = "SASI";
    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + collage);
    }
}

class StaticMethodDemo1 {
    public static void main(String args[]) {
        Student s1 = new Student(4239, "Jayanth");
        Student.changecollage();
        Student s2 = new Student(4207, "Pavankalyan");
        System.out.println("Student detail are :");
        s1.display();
        s2.display();
    }
}
