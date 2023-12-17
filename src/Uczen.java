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
    public void pomoc(){

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
        // Implement the logic to submit assignments
        // This could include storing the assignment, notifying the teacher, etc.
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
