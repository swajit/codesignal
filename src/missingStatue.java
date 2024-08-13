import java.lang.reflect.Array;
import java.util.Arrays;

public class missingStatue {
    public static void main(String[] args){
        int[] integerArray = {6,2,3,8,10};
        System.out.println("Missing Statues are = " + makeArrayConsecutive(integerArray));
        System.out.println("Missing Statues are = " + makeArrayConsecutive2(integerArray));
    }

    private static int makeArrayConsecutive(int[] integerArray) {

        Arrays.sort(integerArray);
        int missingCount=0;
        int missCountIntermediate;
       for (int i=0; i< integerArray.length-1; i++){
           missCountIntermediate = integerArray[i+1]-integerArray[i];

           if (missCountIntermediate != 1){
               missingCount = missingCount + (missCountIntermediate-1);
           }
       }
        return missingCount;
    }

    private static int makeArrayConsecutive2(int[] integerArray) {

        Arrays.sort(integerArray);
        int minValue = integerArray[0];
        int maxValue = integerArray[integerArray.length-1];
        return maxValue - minValue - integerArray.length + 1;

    }
}
