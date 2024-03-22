package ariefprojectkecil.project_one.services.borderlowerclass;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.JarakData;
import ariefprojectkecil.project_one.services.NilaiMaksimum;
import ariefprojectkecil.project_one.services.NilaiMinimum;
import ariefprojectkecil.project_one.services.class_operations.BanyakKelas;
import ariefprojectkecil.project_one.services.class_operations.LebarKelas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatasAtasNilaiKelasTerbawahTest {

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

        LebarKelas opsLK = new LebarKelas();
        opsLK.setValue(opsJD, opsBK);

        BatasAtasNilaiKelasTerbawah opsbbkb = new BatasAtasNilaiKelasTerbawah();
        opsbbkb.setFirstAlternative(opsLK, opsMin);
        opsbbkb.setSecondAlternative(opsLK, opsMin);
        opsbbkb.setThirdAlternative(opsLK, opsMin);

        assertEquals(opsMin.getValue() + opsLK.getValue() - 0.5, opsbbkb.getFirstAlternative());
        assertEquals(opsMin.getValue() + opsLK.getValue() - 1.0, opsbbkb.getSecondAlternative());
        assertEquals(opsMin.getValue() + opsLK.getValue() - 1.5, opsbbkb.getThirdAlternative());

        System.out.println("Nilai Alternatif 1: " + opsbbkb.getFirstAlternative());
        System.out.println("Nilai Alternatif 2: " + opsbbkb.getSecondAlternative());
        System.out.println("Nilai Alternatif 3: " + opsbbkb.getThirdAlternative());
    }
}