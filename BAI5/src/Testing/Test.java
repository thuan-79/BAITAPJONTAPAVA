package Testing;

import java.util.Scanner;
import Class.KhuPho;

public class Test {
    public static void main(String[] args) {
        Scanner sc_123 = new Scanner(System.in);
        KhuPho qlkp_123 = new KhuPho();
        
        // Nhập danh sách hộ dân
        qlkp_123.nhapDanhSach(sc_123);

        // Hiển thị người >= 80 tuổi
        System.out.println("\nDanh sach ho dan co nguoi 80 tuoi tro len:");
        qlkp_123.timKiemThongTin();

        sc_123.close();
    }
}
