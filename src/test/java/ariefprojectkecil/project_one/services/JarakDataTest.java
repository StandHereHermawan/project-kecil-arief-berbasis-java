package ariefprojectkecil.project_one.services;

import ariefprojectkecil.project_one.repository.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JarakDataTest {
    private final NilaiMinimum nilaiMinimum = new NilaiMinimum();
    private final NilaiMaksimum nilaiMaksimum = new NilaiMaksimum();
    private final JarakData jarakData = new JarakData();
    private final int[] number1 = Data.number_1;

    @Test
    void test() {
        nilaiMaksimum.setValue(number1);
        nilaiMinimum.setValue(number1);
        jarakData.setValue(nilaiMaksimum, nilaiMinimum);

        assertEquals(92, jarakData.getValue());
        System.out.println("Jarak Data adalah: " + jarakData.getValue());
    }
}