package ariefprojectkecil.project_one.services.bataskelaspertama;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.JarakData;
import ariefprojectkecil.project_one.services.NilaiMaksimum;
import ariefprojectkecil.project_one.services.NilaiMinimum;
import ariefprojectkecil.project_one.services.class_operations.BanyakKelas;
import ariefprojectkecil.project_one.services.class_operations.LebarKelas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatasAtasNilaiKelasTerbawahTest {
    private final NilaiMinimum nilaiMinimum = new NilaiMinimum();
    private final NilaiMaksimum nilaiMaksimum = new NilaiMaksimum();
    private final JarakData jarakData = new JarakData();
    private final BanyakKelas banyakKelas = new BanyakKelas();
    private final LebarKelas lebarKelas = new LebarKelas();
    private final BatasAtasNilaiKelasTerbawah batasAtasNilaiKelasTerbawah = new BatasAtasNilaiKelasTerbawah();
    private final int[] number1 = Data.number_1;

    @Test
    void test() {
        nilaiMinimum.setValue(number1);
        nilaiMaksimum.setValue(number1);
        banyakKelas.setValue(number1);
        jarakData.setValue(nilaiMaksimum, nilaiMinimum);
        lebarKelas.setValue(jarakData, banyakKelas);
        batasAtasNilaiKelasTerbawah.setValues(lebarKelas, nilaiMinimum);

        assertEquals(nilaiMinimum.getValue() + lebarKelas.getValue() - 0.5, batasAtasNilaiKelasTerbawah.getFirstAlternative());
        assertEquals(nilaiMinimum.getValue() + lebarKelas.getValue() - 1.0, batasAtasNilaiKelasTerbawah.getSecondAlternative());
        assertEquals(nilaiMinimum.getValue() + lebarKelas.getValue() - 1.5, batasAtasNilaiKelasTerbawah.getThirdAlternative());

        System.out.println("Nilai Alternatif 1: " + batasAtasNilaiKelasTerbawah.getFirstAlternative());
        System.out.println("Nilai Alternatif 2: " + batasAtasNilaiKelasTerbawah.getSecondAlternative());
        System.out.println("Nilai Alternatif 3: " + batasAtasNilaiKelasTerbawah.getThirdAlternative());
    }
}