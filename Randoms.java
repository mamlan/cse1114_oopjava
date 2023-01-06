package src.cse114;

public class Randoms {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 2);
            }
        }

        for (int[] i : arr) {
            for (int anInt : i) {
                System.out.print(anInt);
            }
            System.out.println();
        }


        System.out.println("largest row index: " + largestRow(arr));
        System.out.println("largest row column: " + largestColumn(arr));

    }

    public static int largestRow(int[][] m) {
        int maxRowIndex = 0;
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }

    public static int largestColumn(int[][] m) {
        int maxColumnIndex = 0;
        int max = 0;
        for (int col = 0; col < m[0].length; col++) {
            int count = 0;
            for (int[] ints : m)
                if (ints[col] == 1) {
                    count++;
                }
            if (count > max) {
                max = count;
                maxColumnIndex = col;
            }
        }
        return maxColumnIndex;
    }

}
