import java.util.Scanner;
import java.util.ArrayList;

public class Dozierende {

Scanner scanner;

ArrayList<String> feedbackListe = new ArrayList<>();

    private String name;
    private String fakultaet;
    private int bueronummer;

    public Dozierende (String name, String fakultaet, int bueronummer, Scanner scanner) {
        
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
        this.scanner = scanner;
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

    System.out.println("-----------------------------------------------");

    }

    public void sprechstundenBestaetigen (Studierende studierender, String grund, String wunschtermin) {
        System.out.println("Sprechstundenanfrage von: " + studierender.getName());
        System.out.println("Matrikelnummer: " + studierender.getMatrikelnummer());
        System.out.println("Grund: " + grund);
        System.out.println("Wunschtermin: " + wunschtermin);
        System.out.println("-----------------------------------------------");
        System.out.println("Bitte geben sie Ihre Antwort auf die Frage ein" );
        String antwort = scanner.nextLine();
        System.out.println("Die Antwort des Dozenten lautet: " + antwort);
        System.out.println("-----------------------------------------------");

    }

    public void feedbackErhalten(Studierende studierender, String feedback, String empfehlung) {
        feedbackListe.add(studierender.getName() + " Sprechstunden Meinung: " + feedback  + " | " +  "Empfehlung: " + empfehlung);
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Danke fürs Feedback " + studierender.getName());

}

public void feedbackAnzeigen() {
    System.out.println();
    for (String f : feedbackListe) {
        System.out.println(f);
    }
}

}