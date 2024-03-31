package ariefprojectkecil.project_one.services.class_operations;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.JarakData;
import ariefprojectkecil.project_one.services.NilaiMaksimum;
import ariefprojectkecil.project_one.services.NilaiMinimum;
import org.junit.jupiter.api.Test;

class LebarKelasTest {

    private final NilaiMaksimum nilaiMaksimum = new NilaiMaksimum();

    private final NilaiMinimum nilaiMinimum = new NilaiMinimum();

    private final JarakData jarakData = new JarakData();

    private final BanyakKelas banyakKelas = new BanyakKelas();

    private final LebarKelas lebarKelas = new LebarKelas();

    private final int[] number1 = Data.number_1;

    @Test
    void test() {
        nilaiMaksimum.setValue(number1);
        nilaiMinimum.setValue(number1);
        jarakData.setValue(nilaiMaksimum, nilaiMinimum);
        banyakKelas.setValue(number1);
        lebarKelas.setValue(jarakData, banyakKelas);

        System.out.println("Lebar kelas: " + lebarKelas.getValue());
    }
}