import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество элементов в массиве: ");
        int n = sc.nextInt();
        System.out.print("Интервал длины: ");
        int m = sc.nextInt();
            
        int[] arr = new int[n];
        Arrays.setAll(arr, i -> ++i);

        int current = 0;
        System.out.print("Path: ");
        do {
            System.out.print(arr[current]);
            current = (current + m - 1) % n;
        } while (current != 0);
        
        sc.close();
    }
}
