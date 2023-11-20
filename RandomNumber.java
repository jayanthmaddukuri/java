import java.util.Random;
public class RandomNumber{
    public static void main(String args[]){
        Random random = new Random();
        int x = random.nextInt(50);
        int y = random.nextInt(1000);
        System.out.println("Randomly genrated integer values ");
        System.out.println(x);
        System.out.println(y);
        double a = random.nextDouble();
        double b = random.nextDouble();
        System.out.println("Randomly Genrated Double values ");
        System.out.println(a);
        System.out.println(b);
    }
}    
