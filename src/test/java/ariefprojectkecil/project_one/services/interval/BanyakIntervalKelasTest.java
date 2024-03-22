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

class BanyakIntervalKelasTest {

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

        IntervalKelas[] items = opsBIK.getBanyak();
        for (int i = 0; i < items.length; i++) {

            if (i == 0) {
                items[i].setNilaiMinimumKelas(opsBBNKT.getSecondAlternative());
                items[i].setNilaiMaksimumKelas(opsbakb.getSecondAlternative());
            } else {
                items[i].setNilaiMinimumKelas(items[i - 1].getNilaiMaksimumKelas());
                items[i].setNilaiMaksimumKelas(items[i].getNilaiMinimumKelas() + opsLK.getValue());
            }
            System.out.println(
                    "Data Nilai Maksimum interval kelas " + (i + 1) + "  adalah: " + items[i].getNilaiMaksimumKelas()+ ", "
                            + "Data Nilai Minimum interval kelas " + (i + 1) + "  adalah: " + items[i].getNilaiMinimumKelas());
        }
    }
}