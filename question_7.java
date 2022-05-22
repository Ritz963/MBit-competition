import java.util.*;

public class question_7 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int[] heights = new int[n];

        int ans = n - 1;

        for(int x = 0; x<n; x++){
            heights[x] = keyboard.nextInt();
        }

        int tall;
        double diff;
        for(int x = 0; x<n-2; x++){

            diff = heights[x+1] - heights[x];

            for(int y = x+2; y<n; y++){

                if((heights[y] - heights[x]) > diff*(y-x)){
                    ans++;  
                   // System.out.println("yes");
                }

                if((heights[y] - heights[x])/(y-x) > diff){
                    diff = (heights[y] - heights[x])/(double)(y-x);
                }
                
            }

        }

        System.out.println(ans);

    }
}
