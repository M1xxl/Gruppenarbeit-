import java.util.Scanner;

public class main {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        Studierende Alekss = new Studierende("Alekss Timgioh", 102939, "User Experience Design", scanner);
        Studierende Saber = new Studierende("Saber Upamecano", 32902, "User Experience Design", scanner);
        Dozierende dozent = new Dozierende("Nestler"," THI", 204, scanner);
        Studierende Tim = new Studierende("Tim Kellermaus", 32131, "Cybersicherheit", scanner);


        Alekss.frageStellen(dozent);
        Saber.sprechstundenanfrage(dozent);
        Alekss.feedbackGeben(dozent);
        dozent.feedbackAnzeigen();

        Lehrveranstaltung l1 = new Lehrveranstaltung("Softwareentwicklung", dozent);
        Vorlesungsstunde v1 = new Vorlesungsstunde("OOP Grundlagen", "01. 04. 2026", "8:15", "G111");
        Praktikumsstunde p1 = new Praktikumsstunde("GIt Kooperation", "01.04.2026", "8.15", "G111");
        p1.aufgabeHinzufuegen("Git Kennenlernen");
        p1.aufgabeHinzufuegen("ersten Commit machen");

        l1.addStudierende(Saber);
        l1.addVorlesungsstunde(v1);
        l1.addPraktikumsstunde(p1);
        l1.detailsAnzeigen();
        l1.removeStudierende(Alekss);


    }
}