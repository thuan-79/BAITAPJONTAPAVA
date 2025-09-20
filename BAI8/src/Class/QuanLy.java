package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuộc tính
	private ArrayList<CBGV> ds_123;

	// phương thức
	// hàm khởi tạo
	public QuanLy() {
		ds_123 = new ArrayList<CBGV>(10);
	}

	// hàm thêm cán bộ vào danh sách
	public void themCBGV(CBGV canBo_123) {
		ds_123.add(canBo_123);
	}

	// hàm nhập vào danh sách
	public void nhapDanhSach(Scanner sc_123) {
		CBGV canBo_123;

		System.out.print("Nhập vào số lượng cán bộ: ");
		int n_123 = sc_123.nextInt();
		sc_123.nextLine(); // Bắt newline sau khi nhập số nguyên

		System.out.println("Nhập vào danh sách:");
		for (int i_123 = 0; i_123 < n_123; i_123++) {
			System.out.println("Cán bộ thứ " + (i_123 + 1) + " là:");
			canBo_123 = new CBGV();
			canBo_123.nhapThongTin(sc_123);
			themCBGV(canBo_123);
		}
	}

	// hàm hiển thị danh sách
	public void hienThiDanhSach() {
		for (CBGV cb_123 : ds_123) {
			cb_123.hienThiThongTin();
		}
	}

	// hàm tìm kiếm
	public void timKiem(double luong_123) {
		for (CBGV cb_123 : ds_123) {
			if (cb_123.getLuongThucLinh() >= luong_123) {
				cb_123.hienThiThongTin();
			}
		}
	}
}