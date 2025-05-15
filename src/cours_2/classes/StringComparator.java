package cours_2.classes;


import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int comp = s1.compareTo(s2);
        if(comp == 0){
            return 0;
        }
        else if(comp< 0){
            return 1;
        }
        return -1;
    }
}
