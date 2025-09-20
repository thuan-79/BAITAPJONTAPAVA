package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
    // Thuộc tính
    private int soNgayTro_123;
    private String loaiPhong_123;
    private double giaPhong_123;

    // Phương thức
    // Hàm khởi tạo không đối số
    public KhachTro() {
        super();
    }

    // Hàm khởi tạo có đối số
    public KhachTro(String hoTen_123, String CMND_123, int soNgayTro_123, String loaiPhong_123, double giaPhong_123) {
        super(hoTen_123, CMND_123);
        this.soNgayTro_123 = soNgayTro_123;
        this.loaiPhong_123 = loaiPhong_123;
        this.giaPhong_123 = giaPhong_123;
    }

    // Hàm nhập thông tin khách trọ
    @Override
    public void nhapThongTin(Scanner sc_123) {
        super.nhapThongTin(sc_123);
        
        System.out.print("\tNhập số ngày trọ: ");
        this.soNgayTro_123 = sc_123.nextInt();
        sc_123.nextLine(); // Bắt newline sau khi nhập số nguyên

        System.out.print("\tNhập loại phòng: ");
        this.loaiPhong_123 = sc_123.nextLine();

        System.out.print("\tNhập giá phòng: ");
        this.giaPhong_123 = sc_123.nextDouble();
        sc_123.nextLine(); // Bắt newline sau khi nhập số thực
    }

    // Hàm hiển thị thông tin khách trọ
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tSố ngày trọ: " + this.soNgayTro_123);
        System.out.println("\tLoại phòng: " + this.loaiPhong_123);
        System.out.println("\tGiá phòng: " + this.giaPhong_123);
    }

    // Hàm lấy thông tin số ngày trọ
    public int getSoNgayTro() {
        return soNgayTro_123;
    }

    // Hàm lấy thông tin giá phòng
    public double getGiaPhong() {
        return giaPhong_123;
    }
}
