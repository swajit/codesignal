import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class shapeArea {
    public static int shapeArea(int n) {
        int val1 = n*n;
        int val2 = ((n-1)*(n-1));
        return val1+val2;
    }

    public static void main(String[] args) {
      System.out.println(shapeArea(1)); // Expected output: 1
      System.out.println(shapeArea(2)); // Expected output: 5
        System.out.println(shapeArea(3)); // Expected output: 13
        System.out.println(shapeArea(4)); // Expected output: 25
    }

    int solution(int[] statues) {

        List<Integer> arr = new ArrayList<Integer>();
        //arr = Arrays.asList(statues);
    return 1;

    }
}