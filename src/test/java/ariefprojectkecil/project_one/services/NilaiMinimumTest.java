package ariefprojectkecil.project_one.services;

import ariefprojectkecil.project_one.repository.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NilaiMinimumTest {
    private final NilaiMinimum nilaiMinimum = new NilaiMinimum();
    private final int[] number1 = Data.number_1;

    @Test
    void test() {

        nilaiMinimum.setValue(number1);
        assertEquals(6, nilaiMinimum.getValue());
        System.out.println("Nilai Minimum adalah: " + nilaiMinimum.getValue());
    }
}