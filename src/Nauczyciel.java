public class Nauczyciel extends Osoba {
    private int zarobki;
    private String przedmiot;
    private int doswiadczenie;

    public Nauczyciel(String imie, String nazwisko, int telefon, String email, String haslo, String przedmiot, int doswiadczenie, int zarobki) {
        super(imie, nazwisko, telefon, email, haslo);
        this.przedmiot = przedmiot;
        this.doswiadczenie = doswiadczenie;
        this.zarobki = zarobki;
    }

    public Nauczyciel(String imie, String nazwisko, int telefon, String email, String haslo, String przedmiot, int doswiadczenie) {
        super(imie, nazwisko, telefon, email, haslo);
        this.przedmiot = przedmiot;
        this.doswiadczenie = doswiadczenie;
    }

    public void setZarobki(int zarobki){
        this.zarobki = zarobki;
    }

    public int getDoswiadczenie(){
        return this.doswiadczenie;
    }

    public String getPrzedmiot(){
        return this.przedmiot;
    }

    public int getZarobki(){
        return this.zarobki;
    }

    public void wprowadzenieOcen(){

    }

    public void pracaDomowa(){

    }

    public void zarzadzanieUczniami(){

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

}
