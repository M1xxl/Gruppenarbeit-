import java.util.ArrayList;

public class Lehrveranstaltung {

    private String titel;
    private Dozierende dozierender;
    private ArrayList <Studierende> studierendeListe;
    private ArrayList <Vorlesungsstunde> vorlesungsstunden;
    private ArrayList <Praktikumsstunde> praktikumsstunden;

public Lehrveranstaltung(String titel, Dozierende dozierender) {
    this.titel = titel;
    this.dozierender = dozierender;
    this.studierendeListe = new ArrayList<>();
    this.vorlesungsstunden = new ArrayList<>();
    this.praktikumsstunden = new ArrayList<>();


}

public void addStudierende (Studierende studierender) {
    studierendeListe.add(studierender);
    System.out.println(studierender.getName() + " wurde hinzugefügt");
}

public void removeStudierende (Studierende studierender) {
    for (int i = 0; i < studierendeListe.size(); i++ ) {
        if(studierendeListe.get(i) != null && studierendeListe.get(i).getName().equals(studierender.getName())) {
            studierendeListe.remove(i);
            System.out.println();
            System.out.println(studierender.getName()+ "  wurde aus der Lehrveranstaltung entfernt");
            System.out.println();
            return;
        }
    }
    System.out.println(studierender.getName() + " ist nichtmehr in der Lehrveranstaltung. ");
}

public void addVorlesungsstunde (Vorlesungsstunde vorlesungsstunde) {
    vorlesungsstunden.add(vorlesungsstunde);
    System.out.println();
    System.out.println("Vorlesungsstunde wurde hinzugefügt");
}

public void addPraktikumsstunde (Praktikumsstunde praktikumsstunde) {
    praktikumsstunden.add(praktikumsstunde);
    System.out.println();
    System.out.println("Praktikumsstunde wurde hinzugefügt");
}
public void detailsAnzeigen() {
    System.out.println();
    System.out.println("---Lehrveranstaltung: " + titel + " ---");
    System.out.println();
    System.out.println("Dozierender: " + dozierender.getName());
    System.out.println();
    System.out.println("Teilnehmer: ");
    for (Studierende s : studierendeListe) {
        System.out.println("- " + s.getName());
        System.out.println();
    }
    for(Vorlesungsstunde v : vorlesungsstunden) {
        v.detailAnzeigen();
    }
    for(Praktikumsstunde p : praktikumsstunden) {
        p.detailAnzeigen();
    }
}
}