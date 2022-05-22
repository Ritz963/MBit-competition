import java.util.*;

public class question_5 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int[] nums = new int[n];

        for(int x = 0; x<n; x++){
            nums[x] = keyboard.nextInt();
        }

        int heighest = 0;

        for(int x = 0; x<nums.length; x++){
            if(Math.abs(nums[x] - (x+1)) > heighest){
                heighest = (nums[x] - (x+1));
            }
        }

        System.out.println(heighest);

    }
}
