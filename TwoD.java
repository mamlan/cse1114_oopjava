package src.cse114;

public class TwoD {
    public static void main(String[] args) {

    }
    public static void sort(int m[][]) {
        int[] min = new int[2];
        for (int i = 0; i < m.length - 1; i++) {
            min[0] = m[i][0];
            min[1] = m[i][1];
            int index = i;
            for (int j = i + 1; j < m.length; j++) {
                if (m[j][0] <= min[0] && (m[j][0] < min[1] ||
                        m[j][1] < min[0] || m[j][1] < min[1])) {
                    min[0] = m[j][0];
                    min[1] = m[j][1];
                    index = j;
                }
            }
            if (index != i){
                m[index][0] = m[i][0];
                m[index][1] = m[i][1];
                m[i][0] = min[0];
                m[i][1] = min[1];
            }
        }
    }
}
