package ariefprojectkecil.project_one.services.frekuensi;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.JarakData;
import ariefprojectkecil.project_one.services.NilaiMaksimum;
import ariefprojectkecil.project_one.services.NilaiMinimum;
import ariefprojectkecil.project_one.services.borderlowerclass.BatasAtasNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.borderlowerclass.BatasBawahNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.class_operations.BanyakKelas;
import ariefprojectkecil.project_one.services.class_operations.LebarKelas;
import ariefprojectkecil.project_one.services.interval.BanyakIntervalKelas;
import ariefprojectkecil.project_one.services.interval.NilaiIntervalKelas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrekuensiTiapIntervalKelasTest {

    private final FrekuensiTiapIntervalKelas frekuensiTiapIntervalKelas = new FrekuensiTiapIntervalKelas();

    private final NilaiIntervalKelas nilaiIntervalKelas = new NilaiIntervalKelas();

    private final BanyakFrekuensi banyakFrekuensi = new BanyakFrekuensi();

    private final BanyakKelas banyakKelas = new BanyakKelas();

    private final BatasBawahNilaiKelasTerbawah batasBawahNilaiKelasTerbawah = new BatasBawahNilaiKelasTerbawah();

    private final BatasAtasNilaiKelasTerbawah batasAtasNilaiKelasTerbawah = new BatasAtasNilaiKelasTerbawah();

    private final NilaiMinimum nilaiMinimum = new NilaiMinimum();

    private final NilaiMaksimum nilaiMaksimum = new NilaiMaksimum();

    private final LebarKelas lebarKelas = new LebarKelas();

    private final JarakData jarakData = new JarakData();

    private final BanyakIntervalKelas banyakIntervalKelas = new BanyakIntervalKelas();

    @Test
    void test() {

        nilaiMinimum.setMinimum(Data.number);
        assertNotNull(nilaiMinimum.getValue());

        nilaiMaksimum.setMaximum(Data.number);
        assertNotNull(nilaiMaksimum.getMaximum());

        jarakData.setValue(nilaiMaksimum, nilaiMinimum);
        assertNotNull(jarakData.getValue());

        banyakKelas.setValue(Data.number);
        assertNotNull(banyakKelas.getValue());

        lebarKelas.setValue(jarakData, banyakKelas);
        assertNotNull(lebarKelas.getValue());

        batasBawahNilaiKelasTerbawah.setSecondAlternative(nilaiMinimum);

        batasAtasNilaiKelasTerbawah.setSecondAlternative(lebarKelas, nilaiMinimum);

        banyakKelas.setValue(Data.number);
        assertNotNull(banyakKelas.getValue());

        banyakFrekuensi.setBanyak(banyakKelas);
        assertNotNull(banyakFrekuensi.getBanyak());

        banyakIntervalKelas.setBanyak(banyakKelas);
        assertNotNull(banyakIntervalKelas.getBanyak());

        nilaiIntervalKelas.setBanyakFrekuensi(banyakFrekuensi);
        assertNotNull(nilaiIntervalKelas.getBanyakFrekuensi());

        nilaiIntervalKelas.setValues(batasAtasNilaiKelasTerbawah, batasBawahNilaiKelasTerbawah, lebarKelas, banyakIntervalKelas);
        assertNotNull(nilaiIntervalKelas.getValues());

        frekuensiTiapIntervalKelas.setNilaiIntervalKelas(Data.number, nilaiIntervalKelas);
        assertNotNull(frekuensiTiapIntervalKelas.getNilaiIntervalKelas());

/*
        assertEquals(60, Data.number.length);
        assertEquals(6, nilaiMinimum.getValue());
        assertEquals(98, nilaiMaksimum.getMaximum());
        assertEquals(92, jarakData.getValue());
        assertEquals(7, banyakIntervalKelas.getBanyak().length);
        assertEquals(7, banyakKelas.getValue());
        assertEquals(19.0, batasAtasNilaiKelasTerbawah.getSecondAlternative());
        assertEquals(7, banyakKelas.getValue());
        assertEquals(14, lebarKelas.getValue());
        assertEquals(5.0, batasBawahNilaiKelasTerbawah.getSecondAlternative());
        assertEquals(7, banyakFrekuensi.getBanyak().length);
*/

        NilaiIntervalKelas nilaiIntervalKelas = frekuensiTiapIntervalKelas.getNilaiIntervalKelas();
        for (int i = 0; i < nilaiIntervalKelas.getBanyakFrekuensi().length; i++) {
            System.out.println(
                    "Frekuensi Interval "
                            + (i + 1) + " Dengan Jumlah: " + nilaiIntervalKelas.getBanyakFrekuensi()[i].getValue());
        }
    }
}