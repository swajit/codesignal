public class Saakshi {
    public static void main(String[] args){
        int times= 10;
        int counter = 1;
        while(counter <= times){
            for(int j=times-counter; j>0; j-- ){
                System.out.print(" ");
            }
            for(int i=1; i<= counter; i++ ){
                System.out.print(" *");
            }
                System.out.println("");
            counter++;
        }

        int Integer = 24;
        char String  = 'I';
        System.out.print(Integer);
        System.out.print(String);

//                short x = 10;
//                x =  x * 5;
//                System.out.print(x);

        byte x = 127;
        x++;
        x++;
        System.out.print(x);

        System.out.println (" -------------------------");
        int i;
        for(i = 1; i < 6; i++){
            if(i > 3) continue;
        }
        System.out.println(i);
    }
}
