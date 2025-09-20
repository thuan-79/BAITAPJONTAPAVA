package Class;

import java.util.Scanner;

public class Nguoi {
	// thuộc tính
	protected String hoTen_123;
	protected String ngaySinh_123;
	protected String queQuan_123;

	// phương thức
	// hàm khởi tạo không đối số
	public Nguoi() {

	}

	// hàm khởi tạo có đối số
	public Nguoi(String hoTen_123, String ngaySinh_123, String queQuan_123) {
		this.hoTen_123 = hoTen_123;
		this.ngaySinh_123 = ngaySinh_123;
		this.queQuan_123 = queQuan_123;
	}

	// hàm nhập thông tin
	public void nhapThongTin(Scanner sc_123) {
		System.out.print("\tNhập họ tên: ");
		hoTen_123 = sc_123.nextLine();
		System.out.print("\tNhập ngày sinh: ");
		ngaySinh_123 = sc_123.nextLine();
		System.out.print("\tNhập quê quán: ");
		queQuan_123 = sc_123.nextLine();
	}

	// hàm hiển thị
	public void hienThiThongTin() {
		System.out.println("\tHọ tên: " + hoTen_123);
		System.out.println("\tNgày sinh: " + ngaySinh_123);
		System.out.println("\tQuê quán: " + queQuan_123);
	}
}