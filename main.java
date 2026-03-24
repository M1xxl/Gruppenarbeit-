
public class main {
    public static void main (String [] args) {

        Studierende student = new Studierende("Thomas Gottschalk", 102939, "User Experience Design");
        Dozierende dozent = new Dozierende("Keine Ahnung"," THI", 204 );

        student.frageStellen(dozent);
    }
}