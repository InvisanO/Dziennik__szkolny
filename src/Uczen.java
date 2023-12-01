import java.util.Arrays;

public class Uczen extends Osoba{
    private String[] charakterystyka;
    private int ID;
    private ArchivOcen archiv;

    public void przegladInformacji(){

    }

    public void harmonogram(){
        // Harmonogtam.getHarmonogram(ID);
    }

    public void przegladOcen(){

    }

    public Uczen(String imie, String nazwisko, int telefon, String email, String haslo, String... charakterystyka){
        super(imie, nazwisko, telefon, email, haslo);
        this.charakterystyka = charakterystyka;
    }

    public Uczen(String imie, String nazwisko, int telefon, String email, String haslo){
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




}
