package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
	// thuoc tinh
	private String congViec_116;

	// phuong thuc
	// ham khoi tao khong doi so
	public NhanVien() {

	}

	// ham khoi tao co doi so
	public NhanVien(String hoTen_116, String ngaySinh_116, String gioiTinh_116, String diaChi_116, String congViec_116) {
		super(hoTen_116, ngaySinh_116, gioiTinh_116, diaChi_116);
		this.congViec_116 = congViec_116;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_116) {
		super.nhapThongTin(sc_116);
		System.out.print("\tNhap cong viec: ");
		congViec_116 = sc_116.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong viec: " + congViec_116);
	}
}
