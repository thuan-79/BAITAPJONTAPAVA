package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh_123;
	private int thangPhatHanh_123;

	// phuong thuc
	// ham khoi tao khong doi so
	public TapChi() {

	}

	// ham khoi tao co doi so
	public TapChi(String maTaiLieu_123, String tenNXB_123, int soBanPhatHanh_123, int soPhatHanh_123, int thangPhatHanh_123) {
		super(maTaiLieu_123, tenNXB_123, soBanPhatHanh_123);
		this.soPhatHanh_123 = soPhatHanh_123;
		this.thangPhatHanh_123 = thangPhatHanh_123;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_123) {
		super.nhapThongTin(sc_123);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh_123 = sc_123.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh_123 = sc_123.nextInt();
		sc_123.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh_123);
		System.out.println("\tThang phat hanh: " + thangPhatHanh_123);
	}
}
