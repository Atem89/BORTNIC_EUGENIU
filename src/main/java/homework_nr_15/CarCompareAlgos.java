package homework_nr_15;

import java.util.Comparator;

public enum CarCompareAlgos {

    SORT_BY_NAME(((o1, o2) -> {return o1.name.compareTo(o2.name);})),
    SORT_BY_AGE(((o1, o2) -> {return Integer.compare(o1.yearMade, o2.yearMade);}));

    private Comparator<Car> comparator;

    CarCompareAlgos(Comparator<Car> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Car> getComparator (){
        return comparator;
    }

}




