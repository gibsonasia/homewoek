package nyc.c4q.asiagibson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter you name");
        String userInput = readInput();
        String yes = "yes";
        String no = "no";
        String go = "go";


        System.out.println(userInput + " There was a Nuclear attack on your town you go into a house to find food");
        System.out.println("Enter GO to look in the kitchen");
        userInput = readInput();

        if(userInput.equalsIgnoreCase(go)){
            System.out.println("you are now in the kitchen");
        }

        System.out.println("\n" + "to look in cabinets enter YES" );
        userInput = readInput();

        if(userInput.equalsIgnoreCase(yes)){
            System.out.println("you found canned beans");
        }else{
            System.out.println("try again");
            userInput = readInput();
        }

        System.out.println("look around for more food? YES OR NO");
        userInput = readInput();

        if(userInput.equalsIgnoreCase(yes)){
            System.out.println("you have enough food for the week");
        }

        System.out.println("would you like to go upstairs to look for medical supplies? Yes/no?");
        userInput = readInput();

        if (userInput.equalsIgnoreCase(yes)) {
            System.out.println("you are now in the bathroom");
        }


        System.out.println("look around for supplies? Yes");
            userInput = readInput();

            if (userInput.equalsIgnoreCase(yes)) {
                System.out.println("you have enough of both supplies.");
            }

        System.out.println(" you hear a sound.... sneak out quietly? Yes?");
        userInput = readInput();

            if (userInput.equalsIgnoreCase(yes)){
            System.out.println("you got out safely and you camp is good for the week");

        }if (userInput.equalsIgnoreCase(no)) {
            System.out.println("you left with what food you got " +
                    " someone from your camp died because ther wasnt enough meds to assist");
        }
        else{
            System.out.println("invalid input start game over");
        }
    }




    public static String readInput(){
        Scanner scanner = new Scanner(System.in);
        String out = "";
        return scanner.next();
    }


}
