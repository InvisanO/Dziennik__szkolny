import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Uczen extends Osoba implements Serializable {


    private String[] charakterystyka;

    // transient nie moge byc serializowane
    transient private int ID;
    private List<String> przedmioty;
    private static final long serialVersionUID = 1111010;
    public void przegladInformacji(){

    }
    public void harmonogram(){
        // Harmonogtam.getHarmonogram(ID);
    }
    public void przegladOcen(){
        Administrator.wyswietlOceny(this);
    }
    public Uczen(String imie, String nazwisko, int telefon, String email, String haslo, String... charakterystyka)  {
        super(imie, nazwisko, telefon, email, haslo);
        this.charakterystyka = charakterystyka;
    }
    public Uczen(String imie, String nazwisko, int telefon, String email, String haslo) {
        super(imie, nazwisko, telefon, email, haslo);
    }

    @Override
    public String getImie(){return super.getImie();}
    @Override
    public String getNazwisko(){return super.getNazwisko();}
    @Override
    public Integer getTelefon(){return super.getTelefon();};
    @Override
    public String getEmail(){return super.getEmail();};
    @Override
    public String getHaslo(){return super.getHaslo();};
    public String getCharakterystyka(){
        StringBuilder result = new StringBuilder();

        for (String elem : charakterystyka) {
            result.append(elem).append(" ");
        }

        return result.toString();
    }
    public void setCharakterystyka(String... charakterystyka) {
        this.charakterystyka = charakterystyka;
    }
    public void dodajPrzedmiot(String przedmiot) {
        przedmioty.add(przedmiot);
    }
    public void usunPrzedmiot(String przedmiot) {
        przedmioty.remove(przedmiot);
    }
    public void przeslijZadanie(String przedmiot, String tresc) {
        List<Nauczyciel.Zadanie> zadania = // Get the list of assignments from somewhere;

                // Find the zadanie for the specified przedmiot

        for (Nauczyciel.Zadanie zad : Nauczyciel.getZadania()) {
            if (zad.getPrzedmiot().equals(przedmiot)) {
                zadanieDoWyslania = zad;
                break;
            }
        }

        if (zadanieDoWyslania != null) {
            System.out.println("Zadanie wysłane: " + tresc);
            // Additional logic, e.g., store the assignment, notify the teacher, etc.
        } else {
            System.out.println("Brak zadania dla przedmiotu: " + przedmiot);
        }
    }
    }


    @Override
    public String toString() {
        return "Uczen: " +
                "imie - " + imie + '\n' +
                "nazwisko - " + nazwisko + '\n' +
                "telefon - " + telefon + '\n' +
                "email - " + email + '\n' +
                "haslo - " + haslo + '\n' +
                "ID - " + ID + '\n' +
                "charakterystyka: - " + Arrays.toString(charakterystyka);
    }
}
