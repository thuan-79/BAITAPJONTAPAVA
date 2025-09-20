package Class;

import java.util.Scanner;

public class SinhVien {
	// thuộc tính
	protected String hoTen_116;
	protected String maSV_116;
	protected String ngaySinh_116;
	protected String lop_116;

	// phương thức
	// hàm khởi tạo không đối số
	public SinhVien() {

	}

	// hàm khởi tạo có đối số
	public SinhVien(String hoTen_116, String maSV_116, String ngaySinh_116, String lop_116) {
		this.hoTen_116 = hoTen_116;
		this.maSV_116 = maSV_116;
		this.ngaySinh_116 = ngaySinh_116;
		this.lop_116 = lop_116;
	}

	// hàm nhập
	public void nhapThongTin(Scanner sc_116) {
		System.out.print("\tNhập họ tên: ");
		hoTen_116 = sc_116.nextLine();

		System.out.print("\tNhập mã sinh viên: ");
		maSV_116 = sc_116.nextLine();

		System.out.print("\tNhập ngày sinh: ");
		ngaySinh_116 = sc_116.nextLine();

		System.out.print("\tNhập lớp: ");
		lop_116 = sc_116.nextLine();
	}

	// hàm hiển thị
	public void hienThiThongTin() {
		System.out.println("\tHọ tên: " + hoTen_116);
		System.out.println("\tNgày sinh: " + ngaySinh_116);
		System.out.println("\tMã sinh viên: " + maSV_116);
		System.out.println("\tLớp: " + lop_116);
	}
}