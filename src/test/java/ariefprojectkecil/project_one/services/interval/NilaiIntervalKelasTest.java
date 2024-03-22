package ariefprojectkecil.project_one.services.interval;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.JarakData;
import ariefprojectkecil.project_one.services.NilaiMaksimum;
import ariefprojectkecil.project_one.services.NilaiMinimum;
import ariefprojectkecil.project_one.services.borderlowerclass.BatasAtasNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.borderlowerclass.BatasBawahNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.class_operations.BanyakKelas;
import ariefprojectkecil.project_one.services.class_operations.LebarKelas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NilaiIntervalKelasTest {

    @Test
    void test() {
        NilaiMinimum opsMin = new NilaiMinimum();
        opsMin.setMinimum(Data.number);

        NilaiMaksimum opsMax = new NilaiMaksimum();
        opsMax.setMaximum(Data.number);

        BanyakKelas opsBK = new BanyakKelas();
        opsBK.setValue(Data.number);

        JarakData opsJD = new JarakData();
        opsJD.setValue(opsMax, opsMin);

        BatasBawahNilaiKelasTerbawah opsBBNKT = new BatasBawahNilaiKelasTerbawah();
        opsBBNKT.setSecondAlternative(opsMin);

        LebarKelas opsLK = new LebarKelas();
        opsLK.setValue(opsJD, opsBK);

        BatasAtasNilaiKelasTerbawah opsbakb = new BatasAtasNilaiKelasTerbawah();
        opsbakb.setSecondAlternative(opsLK, opsMin);

        BanyakIntervalKelas opsBIK = new BanyakIntervalKelas();
        opsBIK.setBanyak(opsBK);

        NilaiIntervalKelas opsNIK = new NilaiIntervalKelas();
        opsNIK.setValues(opsbakb, opsBBNKT, opsLK, opsBIK);

        IntervalKelas[] items = opsNIK.getValues();
        for (int i = 0; i < items.length; i++) {
            System.out.println(
                    "Data Nilai Maksimum interval kelas " + (i + 1) + "  adalah: " + items[i].getNilaiMaksimumKelas()+ ", "
                            + "Data Nilai Minimum interval kelas " + (i + 1) + "  adalah: " + items[i].getNilaiMinimumKelas());
        }
    }
}