import java.util.ArrayList;
import java.util.Scanner;

public class question_4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //program that takes an in integer and prints a string that is as long as the integer that is filled with random lowercase letters

        int amount = input.nextInt();
        int length;
        String answer = "";
        String random = "";
        char letter;
        int randomNum;
        ArrayList<String> words = new ArrayList<String>();

        //keeps going for array length
        for(int x = 0; x<amount; x++){
            length = input.nextInt();
            
            //keeps making random word
            do{
                random = "";
                for(int y = 0; y<length; y++){
                    randomNum = (int)(Math.random()*26);
                    letter = (char)(randomNum + 97);
                    random += letter;
                }
            }while(words.contains(random));
            words.add(random);
        }

        for(int x = 0; x<words.size()-1; x++){
            System.out.println(words.get(x));
        }

        System.out.println(words.get(words.size()-1));

    }
    
}
    

