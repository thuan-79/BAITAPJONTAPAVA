package BuildClass;

import java.util.Scanner;

public class KhachHang {
	// Thuộc tính
	protected String tenChuHo_123;
	protected int soNha_123;
	protected String maCongTo_123;

	// Phương thức
	// Hàm khởi tạo không đối số
	public KhachHang() {

	}

	// Hàm khởi tạo có đối số để phục vụ cho lớp BienLai
	public KhachHang(String tenChuHo_123) {
		this.tenChuHo_123 = tenChuHo_123;
	}

	// Hàm khởi tạo có đầy đủ đối số
	public KhachHang(String tenChuHo_123, int soNha_123, String maCongTo_123) {
		this.tenChuHo_123 = tenChuHo_123;
		this.soNha_123 = soNha_123;
		this.maCongTo_123 = maCongTo_123;
	}

	// Hàm nhập
	public void nhapThongTin(Scanner sc_123) {
		System.out.print("\tNhập tên chủ hộ: ");
		tenChuHo_123 = sc_123.nextLine();
		System.out.print("\tNhập số nhà: ");
		soNha_123 = sc_123.nextInt();
		sc_123.nextLine(); // Bắt newline sau khi nhập số nguyên
		System.out.print("\tNhập mã công tơ: ");
		maCongTo_123 = sc_123.nextLine();
	}

	// Hàm hiển thị
	public void hienThiThongTin() {
		System.out.println("\tTên chủ hộ: " + tenChuHo_123);
		System.out.println("\tSố nhà: " + soNha_123);
		System.out.println("\tMã công tơ: " + maCongTo_123);
	}
}