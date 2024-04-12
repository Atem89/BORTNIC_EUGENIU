package homework_nr_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NoDuplicate {
    public List<String> noDuplicate(List<String> list){
        List<String> duplicates = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (String i : list) {
            if(set.contains(i)){
                duplicates.add(i);
            }
            else {
                set.add(i);
            }
        }

        return duplicates;
    }
}
