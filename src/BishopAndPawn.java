public class BishopAndPawn {
    public static void main(String[] args) {
        System.out.println(bishopAndPawn("a1", "c3")); // true
        System.out.println(bishopAndPawn("h1", "h3")); // false
        System.out.println(bishopAndPawn2("a1", "c3")); // true
        System.out.println(bishopAndPawn2("h1", "h3")); // false
    }

    public static boolean bishopAndPawn(String bishop, String pawn) {
        // Convert columns from 'a'-'h' to 0-7
        int bishopColumn = bishop.charAt(0) - 'a';
        int pawnColumn = pawn.charAt(0) - 'a';

        // Convert rows from '1'-'8' to 0-7
        int bishopRow = bishop.charAt(1) - '1';
        int pawnRow = pawn.charAt(1) - '1';

        // Check if they are on the same diagonal
        return Math.abs(bishopColumn - pawnColumn) == Math.abs(bishopRow - pawnRow);
    }
    public static boolean bishopAndPawn2(String bishop, String pawn) {

        int x_dist = bishop.charAt(0) - pawn.charAt(0);
        int y_dist = bishop.charAt(1) - pawn.charAt(1);
        System.out.println(x_dist);
        System.out.println(y_dist);
        return Math.abs(x_dist) == Math.abs(y_dist);
    }
}

