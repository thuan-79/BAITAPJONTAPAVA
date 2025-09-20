package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> danhSachHoDan_123 = new ArrayList<>();

    public void nhapDanhSach(Scanner sc_123) {
        System.out.print("Nhap so ho dan: ");
        int n_123 = sc_123.nextInt();
        sc_123.nextLine(); // đọc bỏ Enter
        for (int i_123 = 0; i_123 < n_123; i_123++) {
            System.out.println("Nhap thong tin ho dan thu " + (i_123 + 1) + ":");
            HoDan hd_123 = new HoDan();
            hd_123.nhapThongTin(sc_123);
            danhSachHoDan_123.add(hd_123);
        }
    }

    public void timKiemThongTin() {
        for (HoDan hd_123 : danhSachHoDan_123) {
            hd_123.hienThiNguoi80TuoiTroLen();
        }
    }
}
