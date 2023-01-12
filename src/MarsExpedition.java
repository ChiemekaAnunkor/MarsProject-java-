import java.util.Scanner;

public class MarsExpedition {


    public MarsExpedition(){

    }

    public void BootUp() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Booting up ");
        Thread.sleep(400);
        System.out.print(".");
        Thread.sleep(400);
        System.out.print(".");
        Thread.sleep(400);
        System.out.print(".");
        Thread.sleep(400);
        System.out.println();
        System.out.println("ready");
        Thread.sleep(400);
        System.out.println("Welcome to Mars Expeditions, Before we begin, what is your name?");
        String name =scanner.nextLine();
        System.out.println("Hello "+ name + ", Are you ready to head out ?");
        String input=scanner.nextLine();
        input=input.trim()
;        if(input.equals("y")|| input.equals("Y")|| input.equals("yes")|| input.equals("yeah")){
            System.out.println("Great, I knew you would say that, you are now the leader");
            Thread.sleep(400);
            System.out.println("How people would you like to take with you on this expedition?");
            int numberOfPeople=scanner.nextInt();
;            if (numberOfPeople>2){
                System.out.println("thats way too many, we can only take 2 people");
                numberOfPeople=2;
            }
            Thread.sleep(400);

            System.out.println("Great! what snack would you like to bring");
            scanner.nextLine();
            String snack=scanner.nextLine();
            System.out.println(snack + " is a great Choice");
            Thread.sleep(400);

            System.out.println("Now! Please a vehicle from the list below" + "\nMars Rovers"+ "\nSpace Truck"+ "\nDune Buggy");
           String vehicle=scanner.nextLine();
            System.out.println("A "+vehicle + " nice!, That one is fast");
            Thread.sleep(400);
            System.out.println(" You are all Set " + name + ", You will bring " + numberOfPeople+ " people with you and  " + snack + "as snacks and arriving in style in a " + vehicle );
            Thread.sleep(400);
            System.out.println("count down: ");
            System.out.print(1);
            Thread.sleep(400);
            System.out.print(2);
            Thread.sleep(400);
                   System.out.print(3);
            Thread.sleep(400);
            System.out.println(" GO!!");

        }
        if(input.equals("no")){
            System.out.println("too Bad, wlel you have to go, Bye...");
        }

    }
}
