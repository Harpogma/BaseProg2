package cours_2.classes;


import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        int diff = i1 - i2;
        if(diff == 0){
            return 0;
        }
        else if(diff <0 ) {
            return 1;
        }
        return -1;
    }
}
