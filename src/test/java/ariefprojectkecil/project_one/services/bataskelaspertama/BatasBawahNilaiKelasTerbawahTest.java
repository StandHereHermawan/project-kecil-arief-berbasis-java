package ariefprojectkecil.project_one.services.bataskelaspertama;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.NilaiMinimum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatasBawahNilaiKelasTerbawahTest {
    private final NilaiMinimum nilaiMinimum = new NilaiMinimum();
    private final BatasBawahNilaiKelasTerbawah batasBawahNilaiKelasTerbawah = new BatasBawahNilaiKelasTerbawah();
    private final int[] number1 = Data.number_1;

    @Test
    void test() {
        nilaiMinimum.setValue(number1);
        batasBawahNilaiKelasTerbawah.setValues(nilaiMinimum);

        assertEquals(nilaiMinimum.getValue() - 0.5, batasBawahNilaiKelasTerbawah.getFirstAlternative());
        assertEquals(nilaiMinimum.getValue() - 1.0, batasBawahNilaiKelasTerbawah.getSecondAlternative());
        assertEquals(nilaiMinimum.getValue() - 1.5, batasBawahNilaiKelasTerbawah.getThirdAlternative());

        System.out.println("Nilai Alternatif 1: " + batasBawahNilaiKelasTerbawah.getFirstAlternative());
        System.out.println("Nilai Alternatif 2: " + batasBawahNilaiKelasTerbawah.getSecondAlternative());
        System.out.println("Nilai Alternatif 3: " + batasBawahNilaiKelasTerbawah.getThirdAlternative());
    }
}