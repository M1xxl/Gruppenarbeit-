import java.util.Scanner;

public class  Studierende {
    
Scanner scanner;

    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierende (String name, int matrikelnummer, String studiengang, Scanner scanner) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
        this.scanner = scanner;
    }

    public String getName(){
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void frageStellen (Dozierende dozierender) {
        System.out.println("bitte gebe deine Frage an den Dozenten ein");
        String frage = scanner.nextLine();
        System.out.println("an welchen Dozenten soll die Frage gehen?");
        String Dozentenname = scanner.nextLine();
        dozierender.frageBeantworten(this, frage,Dozentenname);

    }

    public void sprechstundenanfrage (Dozierende dozierender) {
        System.out.println("Benötigen Sie eine Sprechstunde?");
        System.out.println("Bitte gebe deinen Wunschtermin ein: ");
        String wunschtermin = scanner.nextLine();
        System.out.println("Bitte gebe deinen Grund für den Termin ein: ");
        String grund = scanner.nextLine();
        System.out.println("Ihr Wunschtermin ist am: " + wunschtermin);
        System.out.println("-----------------------------------------------");

        dozierender.sprechstundenBestaetigen (this, grund, wunschtermin);
    }

    public void feedbackGeben(Dozierende dozierender) {
        System.out.println();
        System.out.println("Feedback");
        System.out.println("-   -   -   -");
        System.out.println("Wie fanden Sie die Sprechstunde: ");
        String feedback = scanner.nextLine();
        System.out.println("Würden sie die Sprechstunde weiter empfehlen? ");
        String empfehlung = scanner.nextLine();

        dozierender.feedbackErhalten(this, feedback, empfehlung);

    }

}
