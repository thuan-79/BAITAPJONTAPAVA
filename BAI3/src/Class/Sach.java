package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuộc tính
	private String tacGia_123;
	private int soTrang_123;

	// phương thức
	// hàm khởi tạo không đối số
	public Sach() {

	}

	// hàm khởi tạo có đối số
	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia_123 = tacGia;
		this.soTrang_123 = soTrang;
	}

	// hàm nhập
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia_123 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang_123 = sc.nextInt();
		sc.nextLine();
	}

	// hàm hiển thị
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTac gia: " + tacGia_123);
		System.out.println("\tSo trang: " + soTrang_123);
	}
}
