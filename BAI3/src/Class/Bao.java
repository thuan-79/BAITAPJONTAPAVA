package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
	// thuoc tinh
	private String ngayPhatHanh_123;

	// phuong thuc
	// ham khoi tao khong doi so
	public Bao() {

	}

	// ham khoi tao co doi so
	public Bao(String maTaiLieu_123, String tenNXB_123, int soBanPhatHanh_123, String ngayPhatHanh_123) {
		super(maTaiLieu_123, tenNXB_123, soBanPhatHanh_123);
		this.ngayPhatHanh_123 = ngayPhatHanh_123;
	}

	// ham nhap
	@Override
	public void nhapThongTin(Scanner sc_123) {
		super.nhapThongTin(sc_123);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh_123 = sc_123.nextLine();
	}

	// ham hien thi
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh_123);
	}
}
