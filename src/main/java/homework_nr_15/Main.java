package homework_nr_15;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("BMW 3 Series", 2021);
        Car c2 = new Car("Ford Mustang", 1967);
        Car c3 = new Car("Honda Civic", 2019);
        Car c4 = new Car("Chevrolet Corvette", 2023);
        Car c5 = new Car("Volkswagen Beetle", 1972);

        Set<Car> carListHashSet = new HashSet<>(Arrays.asList(c2, c1, c3, c5, c4));
        Set<Car> carListTreeSet = new TreeSet<>(Arrays.asList(c3, c2, c1, c4, c5));

        carListHashSet.stream()
                .sorted((o1, o2) -> {
            return Comparator.comparing((Car e) -> e.yearMade)
                    .reversed()
                    .compare(o1, o2);
        })
        .forEach (e -> System.out.println(e.toString()));

        System.out.println("-------------------------");
        carListTreeSet.stream()
                .sorted(CarCompareAlgos.SORT_BY_NAME.getComparator())
                .forEach(e -> System.out.println(e.toString()));

    }
}
