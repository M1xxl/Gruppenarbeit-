import java.util.Scanner;


public class Dozierende {
    Scanner scanner = new Scanner (System.in);

    private String name;
    private String fakultaet;
    private int bueronummer;

    public Dozierende (String name, String fakultaet, int bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    public String getName() {
        return name;
    }

    public void frageBeantworten(Studierende studierender, String frage, String Dozentenname) {
        System.out.println("Frage von " + studierender.getName() + ": " + frage);
        System.out.println("Die Frage geht an den Dozenten: " + Dozentenname);
        System.out.println("Der Dozierende " + Dozentenname + " antwortet dem Studenten: " + studierender.getName());
        String antwort = scanner.nextLine();
        System.out.println(antwort);
    }
}