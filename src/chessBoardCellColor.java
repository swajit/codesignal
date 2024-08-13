public class chessBoardCellColor{
    boolean solution(String cell1, String cell2) {
        int cel1Int, cel2Int;

        int cel1Int1 = cell1.charAt(0) - 'A';
        cel1Int = cel1Int1 + cell1.charAt(1);
        int cel2Int1 = cell2.charAt(0) - 'A';
        cel2Int = cel2Int1 + cell2.charAt(1);

        System.out.println("cel1Int :" + cel1Int + " | cel2Int :" + cel2Int);
        System.out.println("cel1Int1 :" + cel1Int % 2 + " | cel1Int1 :" + cel2Int % 2);

        boolean a = (cel1Int % 2 != 0) == (cel2Int % 2 != 0);

        // System.out.println("cel1flag :" + cel1color +  " | cel2flag :" + cel2color );

        return a;

    }
}
