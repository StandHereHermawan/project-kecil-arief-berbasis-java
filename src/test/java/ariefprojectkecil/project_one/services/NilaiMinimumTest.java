package ariefprojectkecil.project_one.services;

import ariefprojectkecil.project_one.repository.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NilaiMinimumTest {

    @Test
    void test() {
        NilaiMinimum function = new NilaiMinimum();
        function.setMinimum(Data.number);
        Integer nilaiMinimum = function.getValue();
        assertEquals(6, nilaiMinimum);
        System.out.println("Nilai Minimum adalah: " + nilaiMinimum);
    }
}