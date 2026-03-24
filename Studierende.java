import java.util.Scanner;

public class  Studierende {
    Scanner scanner = new Scanner (System.in);

    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierende (String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
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

}
