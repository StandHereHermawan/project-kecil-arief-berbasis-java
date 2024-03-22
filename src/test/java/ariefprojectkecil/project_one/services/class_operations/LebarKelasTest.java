package ariefprojectkecil.project_one.services.class_operations;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.JarakData;
import ariefprojectkecil.project_one.services.NilaiMaksimum;
import ariefprojectkecil.project_one.services.NilaiMinimum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LebarKelasTest {

    @Test
    void test() {
        NilaiMaksimum operasiMax = new NilaiMaksimum();
        operasiMax.setMaximum(Data.number);

        NilaiMinimum operasiMin = new NilaiMinimum();
        operasiMin.setMinimum(Data.number);

        JarakData operasiJD = new JarakData();
        operasiJD.setValue(operasiMax, operasiMin);

        BanyakKelas opsBK = new BanyakKelas();
        opsBK.setValue(Data.number);

        LebarKelas ops = new LebarKelas();
        ops.setValue(operasiJD, opsBK);

        System.out.println(ops.getValue());
    }
}