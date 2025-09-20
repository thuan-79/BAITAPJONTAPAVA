package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
    private ArrayList<Nguoi> danhSachNguoi_123 = new ArrayList<>();

    public void nhapThongTin(Scanner sc_123) {
        System.out.print("Nhap so nguoi trong ho dan: ");
        int n_123 = sc_123.nextInt();
        sc_123.nextLine(); // đọc bỏ ký tự Enter còn dư
        for (int i_123 = 0; i_123 < n_123; i_123++) {
            System.out.println("Nhap thong tin nguoi thu " + (i_123 + 1) + ":");
            Nguoi nguoi_123 = new Nguoi();
            nguoi_123.nhapThongTin(sc_123);
            danhSachNguoi_123.add(nguoi_123);
        }
    }

    public void hienThiNguoi80TuoiTroLen() {
        for (Nguoi nguoi_123 : danhSachNguoi_123) {
            if (nguoi_123.tinhTuoi() >= 80) {
                nguoi_123.hienThiThongTin();
            }
        }
    }
}
