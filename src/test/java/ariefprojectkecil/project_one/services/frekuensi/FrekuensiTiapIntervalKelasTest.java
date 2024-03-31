package ariefprojectkecil.project_one.services.frekuensi;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.JarakData;
import ariefprojectkecil.project_one.services.NilaiMaksimum;
import ariefprojectkecil.project_one.services.NilaiMinimum;
import ariefprojectkecil.project_one.services.bataskelaspertama.BatasAtasNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.bataskelaspertama.BatasBawahNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.class_operations.BanyakKelas;
import ariefprojectkecil.project_one.services.class_operations.LebarKelas;
import ariefprojectkecil.project_one.services.interval.BanyakIntervalKelas;
import ariefprojectkecil.project_one.services.interval.NilaiIntervalKelas;
import ariefprojectkecil.project_one.util.Show;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrekuensiTiapIntervalKelasTest {

    private final NilaiMinimum nilaiMinimum = new NilaiMinimum();
    private final NilaiMaksimum nilaiMaksimum = new NilaiMaksimum();
    private final JarakData jarakData = new JarakData();
    private final BanyakKelas banyakKelas = new BanyakKelas();
    private final LebarKelas lebarKelas = new LebarKelas();
    private final BatasBawahNilaiKelasTerbawah batasBawahNilaiKelasTerbawah = new BatasBawahNilaiKelasTerbawah();
    private final BatasAtasNilaiKelasTerbawah batasAtasNilaiKelasTerbawah = new BatasAtasNilaiKelasTerbawah();
    private final BanyakIntervalKelas banyakIntervalKelas = new BanyakIntervalKelas();
    private final NilaiIntervalKelas nilaiIntervalKelas = new NilaiIntervalKelas();
    private final FrekuensiTiapIntervalKelas frekuensiTiapIntervalKelas = new FrekuensiTiapIntervalKelas();
    private final BanyakFrekuensi banyakFrekuensi = new BanyakFrekuensi();
    private final int[] number1 = Data.number_1;

    @Test
    void test() {
        nilaiMinimum.setValue(number1);
        nilaiMaksimum.setValue(number1);
        jarakData.setValue(nilaiMaksimum, nilaiMinimum);
        banyakKelas.setValue(number1);
        lebarKelas.setValue(jarakData, banyakKelas);
        batasBawahNilaiKelasTerbawah.setValues(nilaiMinimum);
        batasAtasNilaiKelasTerbawah.setValues(lebarKelas, nilaiMinimum);
        banyakFrekuensi.setValues(banyakKelas);
        banyakIntervalKelas.setValues(banyakKelas);
        nilaiIntervalKelas.setValues(banyakFrekuensi);
        nilaiIntervalKelas.setNilaiPerBanyakIntervalKelas(batasAtasNilaiKelasTerbawah, batasBawahNilaiKelasTerbawah, lebarKelas, banyakIntervalKelas);
        frekuensiTiapIntervalKelas.setNilaiIntervalKelas(number1, nilaiIntervalKelas);

        assertNotNull(nilaiMinimum.getValue());
        assertNotNull(nilaiMaksimum.getValue());
        assertNotNull(jarakData.getValue());
        assertNotNull(banyakIntervalKelas.getBanyak());
        assertNotNull(nilaiIntervalKelas.getBanyakFrekuensi());
        assertNotNull(nilaiIntervalKelas.getIntervalKelas());
        assertNotNull(banyakKelas.getValue());
        assertNotNull(banyakKelas.getValue());
        assertNotNull(lebarKelas.getValue());
        assertNotNull(banyakFrekuensi.getBanyak());
        assertNotNull(frekuensiTiapIntervalKelas.getNilaiIntervalKelas());

        Show.menampilkanNilaiMasingMasingInterval(frekuensiTiapIntervalKelas);

     /* assertEquals(60, Data.number_1.length);
        assertEquals(6, nilaiMinimum.getValue());
        assertEquals(98, nilaiMaksimum.getValue());
        assertEquals(92, jarakData.getValue());
        assertEquals(7, banyakIntervalKelas.getBanyak().length);
        assertEquals(7, banyakKelas.getValue());
        assertEquals(18.0, batasAtasNilaiKelasTerbawah.getSecondAlternative());
        assertEquals(7, banyakKelas.getValue());
        assertEquals(13, lebarKelas.getValue());
        assertEquals(5.0, batasBawahNilaiKelasTerbawah.getSecondAlternative());
        assertEquals(7, banyakFrekuensi.getBanyak().length); */

    }
}