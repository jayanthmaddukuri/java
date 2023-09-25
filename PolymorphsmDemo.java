import java.io.*;
class Animal
{
    public void AnimalSound()
    {
        System.out.println("An animal can make sounds");
    }
}
class Cow extends Animal
{
    public void AnimalSound()
    {
        System.out.println("Cow sounds - mao");
    }
}
class Cat extends Animal
{
    public void AnimalSound()
    {
        System.out.println("Cat sounds - meow");
    }
}
 public class PolymorphsmDemo
{
    public static void main(String args[])
    {
        Animal an = new Animal();
        Animal myCow = new Cow();
        Animal myCat = new Cat();
        an.AnimalSound();
        myCow.AnimalSound();
        myCat.AnimalSound();
    }
}
