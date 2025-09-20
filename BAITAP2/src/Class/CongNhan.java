package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
	// thuoc tinh
	private String bac_116;

	// phuong thuc
	// ham khoi tao khong doi so
	public CongNhan() {

	}

	// ham khoi tao co doi so
	public CongNhan(String hoTen_116, String ngaySinh_116, String gioiTinh_116, String diaChi_116, String bac_116) {
		super(hoTen_116, ngaySinh_116, gioiTinh_116, diaChi_116);
		this.bac_116 = bac_116;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_116) {
		super.nhapThongTin(sc_116);
		System.out.print("\tNhap bac: ");
		bac_116 = sc_116.nextLine();
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tBac: " + bac_116);
	}
}
