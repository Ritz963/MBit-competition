import java.util.Scanner;

public class question_4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //program that takes an in integer and prints a string that is as long as the integer that is filled with random letters

        int amount = input.nextInt();
        int length;

        for(int x = 0; x<amount; x++){
            length = input.nextInt();
            String random = "";
            for(int y = 0; y<length; y++){
                int randomNum = (int)(Math.random()*26);
                char letter = (char)(randomNum + 97);
                random += letter;
            }
            System.out.print(random);
        }
    

    }
    
}
    

