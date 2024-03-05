import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmTestStreamVoid {


    @Test
    public void testRemoveAllCandidates() {
        // Inicializace kandidátů -> Arrange
        List<Person> candidates = new ArrayList<>(List.of(
                new Person("John", 55, 191, 100, Job.ENGINEER, false, List.of()),
                new Person("Peter", 51, 195, 101, Job.UNEMPLOYED, false, List.of("Martin", "Eva")),
                new Person("Eva", 45, 165, 50, Job.ENGINEER, true, List.of()),
                new Person("Martin", 30, 180, 70, Job.DOCTOR, true, List.of()),
                new Person("Eva", 40, 170, 60, Job.TEACHER, false, List.of("John")),
                new Person("Alice", 33, 175, 55, Job.ENGINEER, true, List.of()),
                new Person("Kate", 28, 160, 48, Job.IT, false, List.of("John"))
        ));

        // Zavolání metody -> Act
        Algorithm.streamRemovePeople(candidates, Job.ENGINEER, 50, 1, 90, true, 160, 180);

        // Ověření, že všichni kandidáti byli odstraněni -> Assert
        assertEquals(0, candidates.size(), "Expected all candidates to be removed.");
    }
    @Test
    public void testKeepAllCandidates() {
        // Inicializace kandidátů -> Arrange
        List<Person> candidates = new ArrayList<>(List.of(
                new Person("John", 36, 189, 85, Job.TEACHER, false, List.of()),
                new Person("Peter", 35, 185, 80, Job.TEACHER, false, List.of("Martin", "Eva")),
                new Person("Eva", 31, 165, 50, Job.TEACHER, false, List.of()),
                new Person("Martin", 30, 180, 70, Job.TEACHER, false, List.of()),
                new Person("Eva", 27, 170, 60, Job.TEACHER, false, List.of("John")),
                new Person("Alice", 33, 175, 55, Job.TEACHER, false, List.of()),
                new Person("Kate", 28, 160, 48, Job.TEACHER, false, List.of("John"))
        ));

        // Zavolání metody -> Act
        Algorithm.streamRemovePeople(candidates, Job.TEACHER, 40, 0, 90, false, 150, 190);

        // Ověření, že žádný kandidát nebyl odstraněn -> Assert
        assertEquals(7, candidates.size(), "Expected no candidates to be removed.");
    }

    @Test
    public void testRemoveTwoCandidates() {
        // Inicializace kandidátů -> Arrange
        List<Person> candidates = new ArrayList<>(List.of(
                new Person("John", 36, 189, 85, Job.TEACHER, false, List.of()),
                new Person("Peter", 35, 185, 80, Job.TEACHER, false, List.of("Martin", "Eva")),
                new Person("Eva", 31, 165, 50, Job.TEACHER, false, List.of()),
                new Person("Martin", 30, 180, 70, Job.TEACHER, false, List.of()),
                new Person("Eva", 27, 170, 60, Job.TEACHER, false, List.of("John")),
                new Person("Alice", 33, 175, 55, Job.TEACHER, false, List.of()),
                new Person("Kate", 28, 160, 48, Job.TEACHER, true, List.of("John"))
        ));

        // Zavolání metody -> Act
        Algorithm.streamRemovePeople(candidates, Job.TEACHER, 40, 0, 80, false, 150, 190);

        // Ověření, že jeden kandidát byl odstraněn -> Assert
        assertEquals(5, candidates.size(), "Expected one candidate to be removed.");
    }
}
