package ariefprojectkecil.project_one.services.bataskelaspertama;

import ariefprojectkecil.project_one.repository.Data;
import ariefprojectkecil.project_one.services.JarakData;
import ariefprojectkecil.project_one.services.NilaiMaksimum;
import ariefprojectkecil.project_one.services.NilaiMinimum;
import ariefprojectkecil.project_one.services.class_operations.BanyakKelas;
import ariefprojectkecil.project_one.services.class_operations.LebarKelas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NilaiTengahTest {

    private final NilaiMinimum nilaiMinimum = new NilaiMinimum();

    private final NilaiMaksimum nilaiMaksimum = new NilaiMaksimum();

    private final NilaiTengah nilaiTengah = new NilaiTengah();

    private final JarakData jarakData = new JarakData();

    private final BatasAtasNilaiKelasTerbawah batasAtasNilaiKelasTerbawah = new BatasAtasNilaiKelasTerbawah();

    private final LebarKelas lebarKelas = new LebarKelas();

    private final BanyakKelas banyakKelas = new BanyakKelas();

    private final BatasBawahNilaiKelasTerbawah batasBawahNilaiKelasTerbawah = new BatasBawahNilaiKelasTerbawah();

    private final int[] number1 = Data.number_3;

    @Test
    void test() {
        nilaiMinimum.setValue(number1);
        nilaiMaksimum.setValue(number1);
        banyakKelas.setValue(number1);
        jarakData.setValue(nilaiMaksimum, nilaiMinimum);
        lebarKelas.setValue(jarakData, banyakKelas);
        batasBawahNilaiKelasTerbawah.setValues(nilaiMinimum);
        batasAtasNilaiKelasTerbawah.setValues(lebarKelas, nilaiMinimum);

        nilaiTengah.setValue(batasAtasNilaiKelasTerbawah, batasBawahNilaiKelasTerbawah, 1);
        double value1 = nilaiTengah.getValue();

        nilaiTengah.setValue(batasAtasNilaiKelasTerbawah, batasBawahNilaiKelasTerbawah, 2);
        double value2 = nilaiTengah.getValue();

        nilaiTengah.setValue(batasAtasNilaiKelasTerbawah, batasBawahNilaiKelasTerbawah, 3);
        double value3 = nilaiTengah.getValue();

        System.out.println("Batas Bawah Nilai Kelas Terbawah Opsi 1: " + batasBawahNilaiKelasTerbawah.getFirstAlternative());
        System.out.println("Batas Bawah Nilai Kelas Terbawah Opsi 2: " + batasBawahNilaiKelasTerbawah.getSecondAlternative());
        System.out.println("Batas Bawah Nilai Kelas Terbawah Opsi 3: " + batasBawahNilaiKelasTerbawah.getThirdAlternative());
        System.out.println("Batas Atas Nilai Kelas Terbawah Opsi 1: " + batasAtasNilaiKelasTerbawah.getFirstAlternative());
        System.out.println("Batas Atas Nilai Kelas Terbawah Opsi 2: " + batasAtasNilaiKelasTerbawah.getSecondAlternative());
        System.out.println("Batas Atas Nilai Kelas Terbawah Opsi 3: " + batasAtasNilaiKelasTerbawah.getThirdAlternative());
        System.out.println("Nilai Tengah opsi 1 adalah: " + value1);
        System.out.println("Nilai Tengah opsi 2 adalah: " + value2);
        System.out.println("Nilai Tengah opsi 3 adalah: " + value3);
    }
}