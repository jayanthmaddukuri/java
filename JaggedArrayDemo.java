import java.io.*;
public class JaggedArrayDemo{
    public static void main(String args[]){
        int[][] jarr=new int[3][];
        jarr[0] = new int[1];
        jarr[1] = new int[2];
        jarr[2] = new int[3];
        int count = 0;
        for(int i=0;i<jarr.length;i++){
            for(int j=0;j<jarr[i].length;j++){
                jarr[i][j]=count;
                count++;
            }
        }
        System.out.println("The elements in jagged array are:");
        for(int i=0;i<jarr.length;i++){
            for(int j=0;j<jarr[i].length;j++){
                System.out.print(jarr[i][j]+ " ");
            }
            System.out.println();
            
        }
    }
}
