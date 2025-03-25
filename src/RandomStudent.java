import java.util.*;

public class RandomStudent {

    List<String> students = Arrays.asList("Jofre", "Angel", "Fernando", "Antonio", "Ezequiel", "Alfonso", "Pablo", "Isaac", "Cintia",
            "Aurélien", "Marat", "Luis", "Jose María", "Mar", "Río Hierba", "Marc", "Zohra", "Flavio Augusto", "Pablo Federico");
    Scanner sc = new Scanner(System.in);

    public void getRandomStudent() {

        while (students.size() > 0) {

            System.out.println("To get a student press any key.");
            sc.nextLine();

            Random rand = new Random();
            int randomIndex = rand.nextInt(students.size());
            String studentName = students.get(randomIndex);
            students.remove(randomIndex);

            System.out.println("Our next victim is " + studentName + "\n");

        }
    }
}
