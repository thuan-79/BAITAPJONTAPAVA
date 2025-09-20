package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuộc tính
	private ArrayList<TheMuon> ds_123;

	// phương thức
	// hàm khởi tạo không đối số
	public QuanLy() {
		ds_123 = new ArrayList<TheMuon>(10);
	}

	// hàm thêm thẻ mượn vào danh sách
	public void themTheMuon(TheMuon theMuon_123) {
		ds_123.add(theMuon_123);
	}

	// hàm nhập vào danh sách
	public void nhapDanhSach(Scanner sc_123) {
		TheMuon theMuon_123;

		System.out.print("Nhập vào số lượng thẻ mượn: ");
		int n_123 = sc_123.nextInt();
		sc_123.nextLine(); // Bắt newline sau khi nhập số nguyên

		System.out.println("Nhập vào danh sách:");
		for (int i_123 = 0; i_123 < n_123; i_123++) {
			System.out.println("Thẻ mượn thứ " + (i_123 + 1) + " là:");
			theMuon_123 = new TheMuon();
			theMuon_123.nhapThongTin(sc_123);
			themTheMuon(theMuon_123);
		}
	}

	// hàm hiển thị danh sách trả cuối tháng
	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon the_123 : ds_123) {
			if (the_123.getHanTra().getDate() == 31 || the_123.getHanTra().getDate() == 30) {
				the_123.hienThiThongTin();
			}
		}
	}
}