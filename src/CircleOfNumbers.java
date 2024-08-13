public class CircleOfNumbers {
    int solution(int n, int firstNumber) {

        // n-1 = 10-1 = 9
        //first number = 2  0-1-2-3-4-5
        int calNum = firstNumber + (n/2);
        if(calNum >= n) {
            calNum = calNum-n;
        }
        return calNum;

    }
}
