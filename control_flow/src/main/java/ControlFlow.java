import java.util.Random;
import java.util.Scanner;

public class ControlFlow {
    public static void guessingGame () {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int targetNumber = rand.nextInt(100);
        boolean chosenCorrect = false;

        System.out.println("Guess the number!");
        System.out.println("The number is between 0 and 100");

        while (!chosenCorrect){
            int userInput = sc.nextInt();
            if (userInput == targetNumber){
                chosenCorrect = true;
                System.out.println("Correct!");
            }else if (userInput > targetNumber) {
                System.out.println("Too High!");
            }else{
                System.out.println("Too Low!");
            }
        }
    }

    public static void whatShouldIWear(){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the weather? [Rainy,Sunny,Cloudy,Snow]");
        String Weather = sc.nextLine();

        System.out.println("What is the average temperature?");
        int Temperature = sc.nextInt();

        if (Temperature>45||Temperature<-10){
            System.out.println("Stay inside");
        }else if (Temperature<10 && (Weather.equals("Rainy")||Weather.equals("Snow"))){
            System.out.println("Wear a winter coat");
            if (Weather.equals("Snow")){
                System.out.println("and winter boots");
            }
        } else if (Temperature<10){
            System.out.println("Wear a thick jumper");
        } else if (Temperature<20 &&(Weather.equals("Rainy")||Weather.equals("Snow"))){
            System.out.println("Wear a raincoat");
        } else if (Temperature<20) {
            System.out.println("Wear a jumper");
        }else {
            System.out.println("Wear light clothing");
            if (Weather.equals("Rainy")||Weather.equals("Snow")){
                System.out.println("and bring an umbrella");
            }else if (Weather.equals("Sunny")){
                System.out.println("and wear sun cream");
            }
        }
    }

    public static void main(String[] args) {
        guessingGame();
        whatShouldIWear();
    }
}
