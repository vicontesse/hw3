import java.util.Arrays;

public class TaskTwo {
    static void sum (int...n) {
        int sum = 0;
        int multi = 1;
        int max = 0;
        int b=0;
        for (int i : n)
            System.out.print(i + " ");

        System.out.println();
        int[] arr = new int[n.length];
        for (int i : n) {
            sum = i + sum;
            multi = multi * i;
            max = Math.max(i, max);
            arr[b]=i;
            b++;
            }
        Arrays.sort(arr);
        int min = arr[0];
        System.out.println("Output: ");
        System.out.println("Sum: " +sum);
        System.out.println("Multi: " +multi);
        float aver = (float) sum/n.length;
        System.out.println("Aver: " +aver);
        System.out.println("Max: " +max);
        System.out.println("Min: " +min);
    }


}
