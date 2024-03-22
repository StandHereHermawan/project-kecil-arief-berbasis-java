package ariefprojectkecil.project_one.services.class_operations;

import ariefprojectkecil.project_one.repository.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BanyakKelasTest {

    @Test
    void test() {
        BanyakKelas ops = new BanyakKelas();
        ops.setValue(Data.number);
        Integer value = ops.getValue();
        assertEquals(7 ,value);
        System.out.println("Nilai dari banyak kelas adalah: " + value);
    }
}