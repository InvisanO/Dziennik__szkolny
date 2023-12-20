import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * wydruk arkuszow z ocenami
 * wydruk zarobkow nauczyczeli
 *
 */
public interface Tablice {

    //public void wyswietlOceny(Uczen uczen);

    /**
     * Print statistics for the given data.
     *
     *
     */
    //void wydrukujStatystyke();
    <T> void find(List<T> data, Predicate<T> condition);

    <T> void sort(List<T> data, Comparator<T> criterion);

    double obliczSrednia(List<Double> lista_ocen);
}
