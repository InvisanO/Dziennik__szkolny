import java.util.List;
import java.util.TreeSet;

public class Administrator implements Zarobki, Tablice {

    /**
     * obieg informacji o zaplanowanych zastępstwach oraz odwołanych i przeniesionych lekcjach.
     */



    public void informacjaOZmianach(){

    }
    @Override
    public <T> List<T> wydrukujZarobki(List<T> Lista) {
        System.out.println("Zarobki:");
        for (T element : Lista) {
            System.out.println(element);
        }
        return Lista;
    }

    @Override
    public void wyswietlOceny(List<Integer> oceny) {

    }

    @Override
    public void wydrukujStatystyke(List<String> var) {

    }
    public <T> List<T> obliczSrednia(List<T> lista_ocen){

        return lista_ocen;
    }
}

