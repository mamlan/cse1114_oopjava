package src.cse114;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<String> lst1 = new ArrayList<>(Arrays.asList("Austin", "Dallas", "San Fransisco"));
        ArrayList<String> lst2 = new ArrayList<>(Arrays.asList("Boston", "Chicago", "Denver", "Seattle"));
        System.out.println(mergeList(lst1, lst2));

    }
        public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2) {
            ArrayList<String> result = new ArrayList<String>();
            int i = 0, j = 0;
            while (i < lst1.size() || j < lst2.size()) {
                if (i < lst1.size() && (j >= lst2.size() || lst1.get(i).compareTo(lst2.get(j)) < 0)) {
                    result.add(lst1.get(i++));
                } else {
                    result.add(lst2.get(j++));
                }
            }
            return result;
        }
}
