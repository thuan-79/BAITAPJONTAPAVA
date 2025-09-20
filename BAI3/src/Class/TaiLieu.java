package Class;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu_123;
	private String tenNXB_123;
	private int soBanPhatHanh_123;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu_123, String tenNXB_123, int soBanPhatHanh_123) {
		this.maTaiLieu_123 = maTaiLieu_123;
		this.tenNXB_123 = tenNXB_123;
		this.soBanPhatHanh_123 = soBanPhatHanh_123;
	}

	// nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu_123 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB_123 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh_123 = sc.nextInt();
		sc.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu_123);
		System.out.println("\tTen nha xuat ban: " + tenNXB_123);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh_123);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu_123;
	}
}
