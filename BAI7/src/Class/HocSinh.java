package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
    // thuộc tính
    private String lop_123;
    private String khoHoc_123;
    private String kyHoc_123;

    // phương thức
    // hàm khởi tạo không đối số
    public HocSinh() {

    }

    // hàm khởi tạo có đối số
    public HocSinh(String hoTen_123, String lop_123, String khoaHoc_123, String kyHoc_123) {
        this.hoTen_123 = hoTen_123;
        this.lop_123 = lop_123;
        this.khoHoc_123 = khoaHoc_123;
        this.kyHoc_123 = kyHoc_123;
    }

    // hàm nhập
    public void nhapThongTin(Scanner sc_123) {
        super.nhapThongTin(sc_123);

        System.out.print("\tNhập lớp: ");
        lop_123 = sc_123.nextLine();

        System.out.print("\tNhập khóa học: ");
        khoHoc_123 = sc_123.nextLine();

        System.out.print("\tNhập kỳ học: ");
        kyHoc_123 = sc_123.nextLine();
    }

    // hàm hiển thị
    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tLớp: " + lop_123);
        System.out.println("\tKhóa học: " + khoHoc_123);
        System.out.println("\tKỳ học: " + kyHoc_123);
    }

    // hàm lấy ra thông tin về lớp
    public String getLop() {
        return lop_123;
    }
}
