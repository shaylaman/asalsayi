import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int z = 0;
        for(int i =1;i<=100;i++){
            for(int k = 2; k<i;k++){
                if(i%k==0){
                    z++;
                }
            }
            if(z == 0){
                System.out.print(i+" ");
            }
            z = 0;
        }
    }
}