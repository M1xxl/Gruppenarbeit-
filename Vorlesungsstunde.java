public class Vorlesungsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    public Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;

    }

    public void detailAnzeigen() {
        System.out.println("Thema der Vorlesung: " + thema);
        System.out.println();
        System.out.println("Vorlesung am " + datum);
        System.out.println();
        System.out.println("Vorlesung um " + uhrzeit);
        System.out.println();
        System.out.println("Vorlesung im Raum " + raum);
    }

}