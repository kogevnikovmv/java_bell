import java.util.Random;
import java.util.Scanner;

public class secondSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива NxN: ");
        int num = in.nextInt();
        Random random = new Random();
        int[] array = new int[num*num];
        for(int i=0;i<(num*num);i++){
            array[i]= -50 + (int)(random.nextFloat() * 100);
        }
        int minimum=array[num-1];
        for (int i=0; i<num; ++i) {
            if (i==((num-num%2)/2) && (num%2==1)) {
                continue;
            }
            else if (array[num-1+(num*i-i)]<minimum) {
                minimum=array[num-1+(num*i-i)];
            }
        }
        System.out.println(minimum);
    }
}
