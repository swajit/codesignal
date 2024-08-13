public class FibonaciNumber {

    public static void main (String[] args) {

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int cnt = 10;
        int counter = 0;
        System.out.print(n1 + "," + n2 );
        while (counter <= cnt) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            counter++;
            System.out.print( ","+n3);
        }

        //Execute using recursion

//        int i = 200;
//        int counter2 =0;
//        while(counter2 <= i){
//            System.out.print(febonacci(counter2) + ",");
//            counter++;
//        }

    }

    private static long febonacci(int i){

        //base expression
        if (i==0) return 0;
        if (i<=2) return 1;

        long fibnumber = febonacci(i-1) + febonacci(i-2);
        return fibnumber;
    }
}
