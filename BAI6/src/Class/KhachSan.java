package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    // thuộc tính
    private ArrayList<KhachTro> ds_123;

    // phương thức
    // hàm khởi tạo
    public KhachSan() {
        ds_123 = new ArrayList<KhachTro>();
    }

    // hàm thêm khách trọ vào khách sạn
    public void themKhachTro(KhachTro kt_123) {
        ds_123.add(kt_123);
    }

    // hàm nhập danh sách
    public void nhapDanhSach(Scanner sc_123) {
        KhachTro khach_123;

        System.out.print("Nhập vào số lượng khách: ");
        int n_123 = sc_123.nextInt();
        sc_123.nextLine(); // Bắt newline sau khi nhập số

        System.out.println("Nhập vào thông tin khách trọ:");
        for (int i_123 = 0; i_123 < n_123; i_123++) {
            System.out.println("Khách trọ thứ " + (i_123 + 1) + " là:");
            khach_123 = new KhachTro();
            khach_123.nhapThongTin(sc_123);
            themKhachTro(khach_123);
        }
    }

    // hàm hiển thị
    public void hienThiDanhSach() {
        System.out.println("=== THÔNG TIN KHÁCH TRỌ ===");
        for (KhachTro khach_123 : ds_123) {
            khach_123.hienThiThongTin();
            System.out.println("---------------------------");
        }
    }

    // hàm tính tiền
    public double tinhTien(String CMND_123) {
        double tien_123 = 0;

        for (KhachTro khach_123 : ds_123) {
            if (khach_123.getCMND().equals(CMND_123)) {
                tien_123 = khach_123.getSoNgayTro() * khach_123.getGiaPhong();
                // Dừng vòng lặp sau khi tìm thấy và tính tiền
                break; 
            }
        }

        return tien_123;
    }
}
