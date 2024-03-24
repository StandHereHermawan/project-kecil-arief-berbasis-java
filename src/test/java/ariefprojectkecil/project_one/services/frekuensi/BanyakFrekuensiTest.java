package ariefprojectkecil.project_one.services.frekuensi;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.class_operations.BanyakKelas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BanyakFrekuensiTest {

    @Test
    void test() {
        BanyakKelas banyakKelas = new BanyakKelas();
        banyakKelas.setValue(Data.number);

        BanyakFrekuensi setBanyakFrekuensi = new BanyakFrekuensi();
        setBanyakFrekuensi.setBanyak(banyakKelas);

        Frekuensi[] banyak = setBanyakFrekuensi.getBanyak();
        for (int i = 0; i < banyak.length; i++) {
            Long value = banyak[i].getValue();
            assertNotNull(value);
            System.out.println("Nilai ke " + (i + 1) + " Masing-masing Frekuensi: " + banyak[i].getValue());
        }
    }
}