package Class;

import java.util.Scanner;

public class ThiSinh {
    // thuoc tinh
    private int soBD_123;
    private String hoTen_123;
    private String diaChi_123;
    private String dienUuTien_123;

    // phuong thuc
    // ham khoi tao khong doi so
    public ThiSinh() {

    }

    // ham khoi tao co doi so
    public ThiSinh(int soBD_123, String hoTen_123, String diaChi_123, String dienUuTien_123) {
        this.soBD_123 = soBD_123;
        this.hoTen_123 = hoTen_123;
        this.diaChi_123 = diaChi_123;
        this.dienUuTien_123 = dienUuTien_123;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc_123) {
        System.out.print("\tNhap so bao danh: ");
        soBD_123 = sc_123.nextInt();
        sc_123.nextLine();
        System.out.print("\tNhap ho ten: ");
        hoTen_123 = sc_123.nextLine();
        System.out.print("\tNhap dia chi: ");
        diaChi_123 = sc_123.nextLine();
        System.out.print("\tNhap dien uu tien: ");
        dienUuTien_123 = sc_123.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        System.out.println("\tSo bao danh: " + soBD_123);
        System.out.println("\tHo ten: " + hoTen_123);
        System.out.println("\tDia chi: " + diaChi_123);
        System.out.println("\tDien uu tien: " + dienUuTien_123);
    }

    // ham lay ra thong tin ve so bao danh
    public int getSoBD_123() {
        return soBD_123;
    }
}
