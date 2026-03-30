import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int x = scanner.nextInt();
        int[] arr = new int[x];

        int a = 0;
        int i = 0;
        while (a < x) {
            System.out.println("Enter number:");
            arr[i] = scanner.nextInt();
            i++;
            a++;
        }
        for (int z = 0; z < arr.length; z++) {
            for (int y = 0; y < arr.length - 1 - z; y++) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }

            }
        }
        System.out.println("Sorted Array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
        int sum = 0;
        for (int start = 0; start < arr.length; start++) {
            sum += arr[start];
        }
        System.out.println("Sum: ");
        System.out.println(sum);
        double avg = 0;
        for (int begin = 0; begin < arr.length; begin++) {
            avg += arr[begin];
        }
        avg /= arr.length;
        System.out.println("Average: ");
        System.out.println(avg);

    }

}
