import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
	    Archiv archiv = new Archiv();
        int k = 0;

        for (int i=0; i < 10; i++){
            Question question = new Question(QuestionType.SUCCESOR, archiv);
            System.out.println(question.getText());
            String s = scanner.next();
            if (Objects.equals(s, question.getAnswer())) {
                System.out.println("Korrekt");
                k++;
            } else {
                System.out.println("Falsch. Die richtige Antwort ist " + question.getAnswer());
            }
        }
        System.out.println("Du hast " + k + " Fragen richtig beantwortet!");
    }
}
