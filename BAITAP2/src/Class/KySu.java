package Class;

import java.util.Scanner;

public class KySu extends CanBo {
	// thuoc tinh
	private String nganhDaoTao_116;

	// phuong thuc
	// ham khoi tao khong doi so
	public KySu() {

	}

	// ham khoi tao co doi so
	public KySu(String hoTen_116, String ngaySinh_116, String gioiTinh_116, String diaChi_116, String nganhDaoTao_116) {
		super(hoTen_116, ngaySinh_116, gioiTinh_116, diaChi_116);
		this.nganhDaoTao_116 = nganhDaoTao_116;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_116) {
		super.nhapThongTin(sc_116);
		System.out.print("\tNhap nganh dao tao: ");
		nganhDaoTao_116 = sc_116.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNganh dao tao: " + nganhDaoTao_116);
	}
}
