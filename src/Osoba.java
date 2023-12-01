

abstract class Osoba {
    private String imie;
    private String nazwisko;
    private int telefon;
    private String email;
    private String haslo;


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





}
