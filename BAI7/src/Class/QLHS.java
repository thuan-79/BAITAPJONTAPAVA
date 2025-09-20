package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
    // thuộc tính
    private ArrayList<HocSinh> dshs_123;

    // phương thức
    // hàm khởi tạo
    public QLHS() {
        dshs_123 = new ArrayList<HocSinh>(10);
    }

    // hàm thêm học sinh
    public void themHS(HocSinh hs_123) {
        dshs_123.add(hs_123);
    }

    // hàm nhập danh sách
    public void nhapDanhSachHS(Scanner sc_123) {
        HocSinh hs_123;

        System.out.print("Nhập vào số lượng học sinh: ");
        int n_123 = sc_123.nextInt();
        sc_123.nextLine(); // Bắt newline sau khi nhập số nguyên

        System.out.println("Nhập thông tin cho học sinh trong danh sách:");
        for (int i_123 = 0; i_123 < n_123; i_123++) {
            System.out.println("\tHọc sinh thứ " + (i_123 + 1) + " là:");

            hs_123 = new HocSinh();
            hs_123.nhapThongTin(sc_123);

            themHS(hs_123);
        }
    }

    // hàm hiển thị
    public void hienThiDanhSach() {
        int n_123 = dshs_123.size();
        for (int i_123 = 0; i_123 < n_123; i_123++) {
            System.out.println("\tHọc sinh thứ " + (i_123 + 1) + " là:");
            dshs_123.get(i_123).hienThiThongTin();
        }
    }

    // hàm tìm kiếm thông tin theo năm sinh và quê quán
    public void timKiemThongTin(int nam_123, String que_123) {
        for (HocSinh hs_123 : dshs_123) {
            if ((hs_123.getNgaySinh().getYear() + 1900 == nam_123) && (que_123.equals(hs_123.getQueQuan()))) {
                hs_123.hienThiThongTin();
            }
        }
    }

    // hàm tìm kiếm thông tin theo lớp
    public void timKiemThongTin(String lop_123) {
        for (HocSinh hs_123 : dshs_123) {
            if (lop_123.equals(hs_123.getLop())) {
                hs_123.hienThiThongTin();
            }
        }
    }
}
