import java.util.Scanner;
public class Main {
    public static Scanner kbinput= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String name = "Swajit";
        int number = 45;
        System.out.println("Hello " + name + " your age is :" + number);

        System.out.println("Hello please enter the time : ");
        int time = kbinput.nextInt();


        /// Usage of switch statement
        /*
        switch (time) {
            case 7 -> System.out.println(" Time to wake up !");
            case 9 -> System.out.println(" Time to go to office !");
            case 5 -> System.out.println(" Time to go home 5 !");
            case 10 -> System.out.println(" Time to relax !");
            default -> System.out.println(" Time to sleep !");
        }
        */
        //usage of For Loop
        /*
        for (int i = 0; i <= time; i++){
            //if (i == 8){ break;}
            if (i >= 10 && i <= 13 ){
                continue;
            }
            System.out.println(" i = " + i);
        }

         */
        ///Usage of while
        /*
        int i = 0;
        while ( i <= time){
            System.out.println(" i = " + i);
            i++;
        }
        */
        int i = 0;
        do{
            System.out.println(" i = " + i);
            i++;
        }while ( i <= time);

    }
}