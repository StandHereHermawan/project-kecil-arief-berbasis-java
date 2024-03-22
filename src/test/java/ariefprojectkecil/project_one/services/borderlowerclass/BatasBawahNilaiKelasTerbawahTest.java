package ariefprojectkecil.project_one.services.borderlowerclass;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.NilaiMinimum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatasBawahNilaiKelasTerbawahTest {

    @Test
    void test() {
        NilaiMinimum opsMin = new NilaiMinimum();
        opsMin.setMinimum(Data.number);
        BatasBawahNilaiKelasTerbawah opsBKKB = new BatasBawahNilaiKelasTerbawah();
        opsBKKB.setFirstAlternative(opsMin);
        opsBKKB.setSecondAlternative(opsMin);
        opsBKKB.setThirdAlternative(opsMin);
        assertEquals(opsMin.getValue() - 0.5, opsBKKB.getFirstAlternative());
        assertEquals(opsMin.getValue() - 1.0, opsBKKB.getSecondAlternative());
        assertEquals(opsMin.getValue() - 1.5, opsBKKB.getThirdAlternative());

        System.out.println("Nilai Alternatif 1: " + opsBKKB.getFirstAlternative());
        System.out.println("Nilai Alternatif 2: " + opsBKKB.getSecondAlternative());
        System.out.println("Nilai Alternatif 3: " + opsBKKB.getThirdAlternative());
    }
}