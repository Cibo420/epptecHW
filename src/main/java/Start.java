import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Start {
    public static void main(String[] args) {
        // Vytvoření seznamu 400 náhodných lidí pomoci streamu
        List<Person> streamOfPeople = IntStream.range(0,400 )
                .mapToObj(i -> new Person(
                        RandomData.generateRandomName(),
                        RandomData.getRandomAge(),
                        RandomData.getRandomHeight(),
                        RandomData.getRandomWeight(),
                        RandomData.getRandomJob(),
                        RandomData.getRandomMaritalStatus(),
                        RandomData.generateRandomChildrenNames()))
                .collect(Collectors.toList());
        // Výpis náhodných lidí
        System.out.println("Random people generated with stream:");
        streamOfPeople.forEach(System.out::println);

        //Použití metody, která vytvoří nový seznam lidí, ale původní seznam lidí nezmění
        List <Person> filteredPeople = Algorithm.returnFilteredPeople(streamOfPeople, Job.ENGINEER, 50, 0, 90, true, 160, 180);
        System.out.println("Amount of people that passed the filter is:" + filteredPeople.size());

        //Použití upravitelné filter metody, také mění původní seznam lidí
        Algorithm.streamRemovePeople(streamOfPeople, Job.ENGINEER, 50, 0, 90, true, 160, 180);


        System.out.println("Filtered people:");
        streamOfPeople.forEach(System.out::println);

    }
}
