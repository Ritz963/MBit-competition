import java.util.*;

public class question_6 {
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int t = keyboard.nextInt();
        int n;

        int now;
        int disc;
        int last;
        boolean isLeft = true;
        boolean down = false;
        
        for(int y = 0; y<t; y++){
            down = false;
            isLeft = true;
            n = keyboard.nextInt();

            last = keyboard.nextInt();
            disc = keyboard.nextInt();

            now = keyboard.nextInt();
            disc = keyboard.nextInt();

            if(now > last){
                isLeft = false;
            }
        

            for(int x = 2; x<n; x++){

                now = keyboard.nextInt();
                disc = keyboard.nextInt();

                if(isLeft && now > last){
                    down = true;
                }
                else if(!isLeft && now < last){
                    down = true;
                }
                last = now;
                


            }

            if(down){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }



    }
}
