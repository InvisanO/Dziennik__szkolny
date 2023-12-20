import java.util.Arrays;

public class Nauczyciel extends Osoba {

    private int zarobki;
    private String[] przedmioty;
    private int doswiadczenie;

    //archiv ocen z danego przedmiotu
    private ArchivOcen archivOcen;

    public void putOcena(Administrator admin, Uczen uczen, double ocena, String przedmiot) {
        if (archivOcen != null) {
            archivOcen.dodajOcene(ocena, przedmiot);
            admin.dodajArchiv(archivOcen, uczen);
        }else {
            System.out.println("Nie znaleziono archivu");
        }
    }


    public Nauczyciel(String imie, String nazwisko, int telefon, String email, String haslo, int doswiadczenie, int zarobki, String... przedmioty) {
        super(imie, nazwisko, telefon, email, haslo);
        this.przedmioty = przedmioty;
        this.doswiadczenie = doswiadczenie;
        this.zarobki = zarobki;
        this.archivOcen = new ArchivOcen();
    }

    public Nauczyciel(String imie, String nazwisko, int telefon, String email, String haslo, int doswiadczenie, String... przedmioty) {
        super(imie, nazwisko, telefon, email, haslo);
        this.przedmioty = przedmioty;
        this.doswiadczenie = doswiadczenie;
        this.archivOcen = new ArchivOcen();
    }

    public void setZarobki(int zarobki){
        this.zarobki = zarobki;
    }

    public int getDoswiadczenie(){
        return this.doswiadczenie;
    }

    public void setDoswiadczenie(int doswiadczenie) {
        this.doswiadczenie = doswiadczenie;
    }

    public void setPrzedmioty(String[] przedmioty){
        this.przedmioty = przedmioty;
    }

    public String[] getPrzedmioty(){
        return this.przedmioty;
    }

    public int getZarobki(){
        return this.zarobki;
    }

    // inner class of the class Nauczyciel
    public class Zadanie {

        private String tytul;
        private String termin;
        private String opis;
        private int punkty;
        /* Funktional do zcytu opisu zadania
        z pliku w strukture danych
        */
        public Zadanie(String tytul, String termin, String opis, int punkty) {
            this.tytul = tytul;
            this.termin = termin;
            this.opis = opis;
            this.punkty = punkty;
        }
        public String getTytul() {
            return tytul;
        }

        public String getTermin() {
            return termin;
        }

        public String getOpis() {
            return opis;
        }

        public int getPunkty() {
            return punkty;
        }


    }


    public void pracaDomowa() {
        // Implement the logic for assigning homework
        // For example, you might list the subjects, allow the teacher to select one,
        // and then enter details about the homework assignment.
    }

    public void zarzadzanieUczniami() {
        // Implement the logic for managing students
        // This could include displaying a list of students, their information, and options to perform various actions.
    }

    @Override
    public String getImie(){return super.getImie();}

    @Override
    public String getNazwisko(){return super.getNazwisko();}

    @Override
    public Integer getTelefon(){return super.getTelefon();}
    @Override
    public String getEmail(){return super.getEmail();}
    @Override
    public String getHaslo(){return super.getHaslo();}

    @Override
    public void pomoc(){


    }

    @Override
    public String toString() {
        return "Nauczyciel: " +
                "imie - " + imie + '\n' +
                "nazwisko - " + nazwisko + '\n' +
                "telefon - " + telefon + '\n' +
                "email - " + email + '\n' +
                "haslo - " + haslo + '\n' +
                "zarobki - " + zarobki + '\n' +
                "przedmiot - " + przedmioty + '\n' +
                "doswiadczenie - " + doswiadczenie;
    }

}
