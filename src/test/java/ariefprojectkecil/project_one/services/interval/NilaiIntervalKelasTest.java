package ariefprojectkecil.project_one.services.interval;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.JarakData;
import ariefprojectkecil.project_one.services.NilaiMaksimum;
import ariefprojectkecil.project_one.services.NilaiMinimum;
import ariefprojectkecil.project_one.services.bataskelaspertama.BatasAtasNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.bataskelaspertama.BatasBawahNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.class_operations.BanyakKelas;
import ariefprojectkecil.project_one.services.class_operations.LebarKelas;
import ariefprojectkecil.project_one.util.Show;
import org.junit.jupiter.api.Test;

class NilaiIntervalKelasTest {
    private final NilaiMinimum nilaiMinimum = new NilaiMinimum();
    private final NilaiMaksimum nilaiMaksimum = new NilaiMaksimum();
    private final BanyakKelas banyakKelas = new BanyakKelas();
    private final JarakData jarakData = new JarakData();
    private final LebarKelas lebarKelas = new LebarKelas();
    private final BatasBawahNilaiKelasTerbawah batasBawahNilaiKelasTerbawah = new BatasBawahNilaiKelasTerbawah();
    private final BatasAtasNilaiKelasTerbawah batasAtasNilaiKelasTerbawah = new BatasAtasNilaiKelasTerbawah();
    private final BanyakIntervalKelas banyakIntervalKelas = new BanyakIntervalKelas();
    private final NilaiIntervalKelas nilaiIntervalKelas = new NilaiIntervalKelas();
    private final int[] number1 = Data.number_1;

    @Test
    void test() {
        nilaiMinimum.setValue(number1);
        nilaiMaksimum.setValue(number1);
        banyakKelas.setValue(number1);
        jarakData.setValue(nilaiMaksimum, nilaiMinimum);
        batasBawahNilaiKelasTerbawah.setValues(nilaiMinimum);
        lebarKelas.setValue(jarakData, banyakKelas);
        batasAtasNilaiKelasTerbawah.setValues(lebarKelas, nilaiMinimum);
        banyakIntervalKelas.setValues(banyakKelas);
        nilaiIntervalKelas.setNilaiPerBanyakIntervalKelas(batasAtasNilaiKelasTerbawah, batasBawahNilaiKelasTerbawah, lebarKelas, banyakIntervalKelas);

        Show.menampilkanNilaiIntervalKelasSesuaiBanyakKelas(nilaiIntervalKelas);
    }
}