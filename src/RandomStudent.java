import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomStudent {

    public ArrayList<String> students = new ArrayList<>(List.of("Jofre", "Angel", "Fernando", "Antonio", "Ezequiel", "Alfonso", "Pablo", "Isaac", "Cintia",
            "Aurélien", "Marat", "Luis", "Jose María", "Mar", "Río Hierba", "Marc", "Zohra", "Flavio Augusto", "Pablo Federico"));
    Scanner sc = new Scanner(System.in);

    public void getRandomStudent() {

        while (students.size() > 0) {

            System.out.println("To get a student press any key.");
            sc.nextLine();

            Random rand = new Random();
            int n = rand.nextInt(students.size());
            String studentName = students.get(n);
            students.remove(n);

            System.out.println("Our next victim is " + studentName + "\n");

        }
    }
}
