import java.util.ArrayList;
import java.util.Scanner;

public class question_3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int k = keyboard.nextInt();


        int[] shit = new int[n];
        for (int i = 0; i < n; i++) {
            shit[i] = keyboard.nextInt();
        }

        int smallest = k * 2;
        ArrayList < Integer > list = new ArrayList < Integer > ();

        //checks every number in the array
        for (int x = 0; x < n; x++) {

            int timeBetween = Math.abs((shit[x] % k) * 2 - k);

            //checks if the number is smaller than the smallest
            if (timeBetween < smallest) {
                list.clear();
                smallest = timeBetween;
                list.add(x + 1);
            } else if (timeBetween == smallest) {
                list.add(x + 1);
            }
        }

        //prints everything
        for (int x = 0; x < list.size(); x++) {
            System.out.print(list.get(x) + " ");
        }


    }

}