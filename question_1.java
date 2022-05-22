import java.util.Scanner;

public class question_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int person;
        int total = 0;

        for(int x = 0; x<3; x++){
            person = input.nextInt();
            if(person > 59){
                total += 15;
            }
            else if(person > 17){
                total+=20;
            }
            else{
                total += 10;
            }
        }    
        
        System.out.println(total);
    }
}
