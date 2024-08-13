import java.util.Scanner;

public class CenturyFromYear {
    public static Scanner kbinput= new Scanner (System.in);
    public static void main(String[] args){
        System.out.println("Hello please enter the year : ");
        int year = kbinput.nextInt();
        //int num2 = 10;
        System.out.println("Century for the year " + year + " = " + getCentury(year));
    }

    private static int getCentury(int year) {

        return (year+99)/100;
    }
}
