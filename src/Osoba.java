

abstract class Osoba {
    protected String imie;
    protected String nazwisko;
    protected int telefon;
    protected String email;
    protected String haslo;


    public Osoba(String imie, String nazwisko, int telefon, String email, String haslo){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.email = email;
        this.haslo = haslo;
    }

    public String getImie(){return this.imie;};
    public String getNazwisko(){return this.nazwisko;}
    public Integer getTelefon(){return this.telefon;};
    public String getEmail(){return this.email;};
    public String getHaslo(){return this.haslo;};

    abstract void pomoc();
    @Override
    public String toString() {
        return "imie - " + this.imie + '\n' +
                "nazwisko - " + this.nazwisko + '\n' +
                "telefon - " + this.telefon + '\n' +
                "email - " + this.email + '\n' +
                "haslo - " + this.haslo + '\n';
    }




}
