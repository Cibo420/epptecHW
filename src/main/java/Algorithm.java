import java.util.List;
import java.util.stream.Collectors;

public class Algorithm {

    // Filtrovací metoda pomocí streamu, která ponechá pouze lidi, kteří splňují zadané parametry -> Mění původní seznam lidí!
    public static List<Person> streamRemovePeople(List<Person> people, Job jobToKeep, int maxAge, int minChildren, int maxWeight, boolean isMarried, int minHeight, int maxHeight) {
        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getJob() == jobToKeep)
                .filter(person -> person.getAge() <= maxAge)
                .filter(person -> person.getChildren().size() >= minChildren)
                .filter(person -> person.getWeight() <= maxWeight)
                .filter(person -> person.isMarried() == isMarried)
                .filter(person -> person.getHeight() <= maxHeight)
                .filter(person -> person.getHeight()>= minHeight)
                .collect(Collectors.toList());

        people.clear();
        people.addAll(filteredPeople);

        return filteredPeople;
    }

    // Filtrovací metoda pomocí streamu, která ponechá pouze lidi, kteří splňují zadané parametry -> Nemění původní seznam lidí!
    public static List<Person> returnFilteredPeople(List<Person> people, Job jobToKeep, int maxAge, int minChildren, int maxWeight, boolean isMarried, int minHeight, int maxHeight) {
         List<Person> filteredPeople =people.stream()
                .filter(person -> person.getJob() == jobToKeep)
                .filter(person -> person.getAge() <= maxAge)
                .filter(person -> person.getChildren().size() >= minChildren)
                .filter(person -> person.getWeight() <= maxWeight)
                .filter(person -> person.isMarried() == isMarried)
                .filter(person -> person.getHeight() <= maxHeight)
                .filter(person -> person.getHeight() >= minHeight)
                .collect(Collectors.toList());
         return filteredPeople;
    }
}
