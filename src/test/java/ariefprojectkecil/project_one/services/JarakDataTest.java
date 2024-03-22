package ariefprojectkecil.project_one.services;

import ariefprojectkecil.project_one.repository.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JarakDataTest {

    @Test
    void test() {
        NilaiMaksimum operasiMax = new NilaiMaksimum();
        operasiMax.setMaximum(Data.number);

        NilaiMinimum operasiMin = new NilaiMinimum();
        operasiMin.setMinimum(Data.number);

        JarakData operasiJD = new JarakData();
        operasiJD.setValue(operasiMax, operasiMin);

        Integer value = operasiJD.getValue();
        assertEquals(92, value);
        System.out.println("Jarak Data adalah: " + value);
    }
}