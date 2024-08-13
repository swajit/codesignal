public class AlmostSubstring {
    public static void main(String[] args) {
        String s = "abacabadabacaba";
        String p = "abac";
        int result = almostSubstring(s, p);
        System.out.println(result); // Expected output: 6
    }

    public static int almostSubstring(String s, String p) {
        int result = 0;
        int slength = s.length();
        int plength = p.length();

        String subStr = "";
        for(int i=0; i< slength-plength+1; i++ ){
            subStr = s.substring(i,i+plength);
            if(isMatch(subStr,p)){
                result++;
            }
        }
        return result;
    }

    private static boolean isMatch(String sStr, String p ){
        System.out.print("Comparing substring : " + sStr + " to pattern: " + p);

        boolean match = true;
        if (sStr.equals(p))
            return true;
        int counter = 0;

        for(int i=0; i<p.length(); i++){
            if (sStr.charAt(i) != p.charAt(i)){
                counter++;
            }
        }
        System.out.print(" counter : " + counter);
        System.out.println();

        return counter<=1;
    }
}
