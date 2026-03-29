import java.util.Scanner;

public class main {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        Studierende student = new Studierende("Thomas Gottschalk", 102939, "User Experience Design", scanner);
        Dozierende dozent = new Dozierende("Keine Ahnung"," THI", 204, scanner );

        student.frageStellen(dozent);

        student.sprechstundenanfrage(dozent);
    }
}