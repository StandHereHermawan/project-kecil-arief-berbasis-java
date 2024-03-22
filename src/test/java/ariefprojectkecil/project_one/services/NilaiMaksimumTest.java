package ariefprojectkecil.project_one.services;

import ariefprojectkecil.project_one.repository.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NilaiMaksimumTest {

    @Test
    void test() {
        NilaiMaksimum nilai = new NilaiMaksimum();
        nilai.setMaximum(Data.number);
        Integer nilaiHighest = nilai.getMaximum();
        assertEquals(98, nilai.getMaximum());
        System.out.println("Nilai Terbesar dari data diatas adalah: "+nilaiHighest);
    }
}