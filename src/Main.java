public class Main {



    /**
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        meals= meals-(0.75*shipPopulation);
        System.out.println(meals);
        meals=meals+(meals*.5);
        System.out.println(meals);
        shipPopulation=shipPopulation+5;

        String landingLocation = "the plains";
         if (landingLocation=="the plains"){
             System.out.print("Bbzzz Landing on the Plain");
         } else {
             System.out.print("ERROR!!! Flight plan already set. Landing on The Plain");
         }

        landingCheck(20);

    }



    public static boolean landingCheck(int minutesLeft) throws InterruptedException {

        for (int i = 0; i < minutesLeft; i++) {
            if(i%3==0 && i%2==0){
                System.out.println("calculating");
            } else if (i%3==0) {
                System.out.println("left");
            } else if (i%2==0) {
                System.out.println("right");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }


}