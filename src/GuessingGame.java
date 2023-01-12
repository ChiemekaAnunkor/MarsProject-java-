import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {
    private String name;
    private int userGuess;

    public GuessingGame(){

    }
    public String Greeting () throws InterruptedException {
        Scanner scanner= new Scanner(System.in);

        System.out.println("What is your name");
        String nameToGreet=scanner.nextLine();

        String[] split=nameToGreet.split("");
        split[0]=split[0].toUpperCase();
        nameToGreet=String.join( "",split);

        System.out.println("Hello " + nameToGreet + ", lets play a guessing game");
        Thread.sleep(900);
        System.out.println("I am thinking of a number between 1-100");
        Thread.sleep(800);
        System.out.println("What is your guess?");

        return nameToGreet;
    }
    public int RandomNumberBtw1and100 (){

        int randomnumber=(int)Math.floor(Math.random()*100);
        return randomnumber;
    }

    public void playGame(String player, int cpuNumber){
        System.out.println(cpuNumber);
        System.out.println(player);
        System.out.print("Enter Number:  ");
        Scanner scanner = new Scanner(System.in);
        int userAttempts=0;
        int userInput = 0;
        while(cpuNumber!= userInput){


            try{
                userInput =scanner.nextInt();
            }catch(InputMismatchException e){
                String bad_input = scanner.next();
                System.out.println("bad bad bad, try a number");
                continue;
            }



            if(userInput>100 || userInput<1){
                System.out.println("you suck at listening, i said between 1-100!!");
                continue;
            }
             if(userInput>cpuNumber){
                 System.out.println("Your guess was too High! try again. ");
             }
             if(userInput<cpuNumber){
                 System.out.println("Your guess was too low! try again. ");

             }

            userAttempts++;
            if(userInput==cpuNumber){
                userInput=cpuNumber;
                System.out.println(player + " Good job! The Correct number is " + userInput+ ". It only took "  + userAttempts + " Attempt(s)");
            }

        }


    }

}
