package ariefprojectkecil.project_one.services.class_operations;

import ariefprojectkecil.project_one.repository.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BanyakKelasTest {

    private final int[] number1 = Data.number_1;

    private final BanyakKelas banyakKelas = new BanyakKelas();

    @Test
    void test() {
        banyakKelas.setValue(number1);
        assertEquals(7, banyakKelas.getValue());
        System.out.println("Nilai dari banyak kelas adalah: " + banyakKelas.getValue());
    }
}