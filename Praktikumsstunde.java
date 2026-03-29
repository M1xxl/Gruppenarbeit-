import java.util.ArrayList;;

public class Praktikumsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;
    private ArrayList <String> aufgaben;

    public Praktikumsstunde (String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = new ArrayList<>();

    }

    public void aufgabeHinzufuegen(String aufgabe) {
        aufgaben.add(aufgabe);

    }

public void detailAnzeigen() {
    System.out.println();
    System.out.println("---Praktikum---");
    System.out.println();
    System.out.println("Thema: " + thema);
    System.out.println("am " + datum);
    System.out.println("um " + uhrzeit);
    System.out.println("im Raum: " + raum);
    System.out.println();
    System.out.println("Aufgaben: ");
    for(String aufgabe : aufgaben) {
        System.out.println("- " + aufgabe);
    }

}


}