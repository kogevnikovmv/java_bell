import java.util.Arrays;
import java.util.Scanner;

public class thirdSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива NxN: ");
        int num = in.nextInt();
        if (num%2!=0) {System.out.println("N - должно быть чётным числом"); System.exit(0);}
        int[][] array=new int[num][num];

        for(int i=0; i<=(num/2-2); i++) {
            System.out.println("#"+i);
            for (int item = 0; item < (num); item++) {
                array[num / 2 - 2-i][item] = i+1;
                array[num / 2 + 1+i][item] = i+1;
                for(int[] row: array) {
                    row[num / 2 - 2-i]=i+1;
                    row[num / 2 + 1+i]=i+1;
                }
            }
        }
        for (int[] item: array){
            System.out.println(Arrays.toString(item));
        }
    }
}