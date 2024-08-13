import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class Test {
    public static void main (String[] args){
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Swajit");
        map1.put(2,"Sonali");
        map1.put(3,"Saanvi");
        map1.put(4,"Sakshi");
        map1.putIfAbsent(4,"Scout");

        for(Integer i: map1.keySet()){
            System.out.println(i +"  -  "+ map1.get(i));
        }

        Pattern VOWELS_PATTERN = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        String regex = "[aeiouAEIOU]";
        String text = "saakshi";
        if (VOWELS_PATTERN.matcher(text).find()){
            System.out.println("has vowels");
        }else{
            System.out.println("Not a vowels");

        }

        int n = 6;
        List<String> ans = new ArrayList<>();
                for (int i = 1; i < n; ++i) {
                    for (int j = 1; j <=n ; ++j) {

                        if (gcd(i,j) == 1 && i/j <1) {
                            System.out.print(i % j + "  - ");
                            System.out.print(gcd(i,j) + " GCD - ");
                            System.out.println(i + "/" + j);
                        ans.add(i + "/" + j);
                        }
                    }
                }

    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
