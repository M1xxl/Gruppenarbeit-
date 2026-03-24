
public class main {
    public static void main (String [] args) {

        Studierender student = new Studierender("Thomas Gottschalk", 102939, "User Experience Design");
        Dozierender dozent = new Dozierender("Keine Ahnung"," THI", 204 );

        student.frageStellen(dozent);
    }
}