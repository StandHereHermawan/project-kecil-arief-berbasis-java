package ariefprojectkecil.project_one.services.frekuensi;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.class_operations.BanyakKelas;
import ariefprojectkecil.project_one.util.Show;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BanyakFrekuensiTest {
    private final BanyakKelas banyakKelas = new BanyakKelas();
    private final BanyakFrekuensi banyakFrekuensi = new BanyakFrekuensi();
    private final int[] number1 = Data.number_1;

    @Test
    void test() {
        banyakKelas.setValue(number1);
        banyakFrekuensi.setValues(banyakKelas);

        assertNotNull(banyakFrekuensi);
        Show.menampilkanBanyakFrekuensi(banyakFrekuensi.getBanyak());
    }
}