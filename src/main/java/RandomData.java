import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomData {

    private static final String[] NAMES = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Henry","Ivy", "Jack", "Kate", "Liam", "Mia"};

    public static String generateRandomName() {
        Random random = new Random();
        int index = random.nextInt(NAMES.length);
        return NAMES[index];
    }

    public static int getRandomAge() {
        return (int) (Math.random() * 30) + 20; // Věk mezi 20 a 50 lety
    }

    public static int getRandomHeight() {
        return (int) (Math.random() * 40) + 150; // Výška mezi 150 a 190 cm
    }

    public static int getRandomWeight() {
        return (int) (Math.random() * 50) + 50; // Váha mezi 50 a 100 kg
    }

    public static Job getRandomJob() {
        Job[] jobs = Job.values();
        return jobs[new Random().nextInt(jobs.length)];
    }

    public static boolean getRandomMaritalStatus() {
        return Math.random() < 0.5; // 50% pravděpodobnost, že je ženatý/vdaná
    }

    public static List<String> generateRandomChildrenNames() {
        int numberOfChildren = (int) (Math.random() * 3); // Náhodný počet dětí (0-2)
        return IntStream.range(0, numberOfChildren)
                .mapToObj(i -> generateRandomName())
                .collect(Collectors.toList());
    }
}
