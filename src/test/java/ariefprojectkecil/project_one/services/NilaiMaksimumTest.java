package ariefprojectkecil.project_one.services;

import ariefprojectkecil.project_one.repository.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NilaiMaksimumTest {

    private final NilaiMaksimum nilaiMaksimum = new NilaiMaksimum();
    private final int[] number1 = Data.number_1;

    @Test
    void test() {
        nilaiMaksimum.setValue(number1);

        assertEquals(98, nilaiMaksimum.getValue());
        System.out.println("Nilai Terbesar dari data diatas adalah: " + nilaiMaksimum.getValue());
    }
}