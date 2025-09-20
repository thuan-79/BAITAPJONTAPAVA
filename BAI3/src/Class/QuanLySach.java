package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	// thuộc tính
	private ArrayList<TaiLieu> dstl_123;

	// hàm khởi tạo
	public QuanLySach() {
		dstl_123 = new ArrayList<TaiLieu>(10);
	}

	// thêm mới 1 tài liệu
	public void themTaiLieu(TaiLieu tl_123) {
		dstl_123.add(tl_123);
	}

	// nhập danh sách tài liệu
	public void nhapDanhSachTL(Scanner sc_123) {
		int chon_123;
		String stop_123;
		TaiLieu tl_123;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon_123 = sc_123.nextInt();
			sc_123.nextLine();

			switch (chon_123) {
			case 1:
				tl_123 = new Sach();
				break;
			case 2:
				tl_123 = new TapChi();
				break;
			case 3:
				tl_123 = new Bao();
				break;

			default:
				tl_123 = new Sach();
				break;
			}

			tl_123.nhapThongTin(sc_123);
			themTaiLieu(tl_123);

			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop_123 = sc_123.nextLine();
		} while (stop_123.equals("c"));
	}

	// tìm kiếm theo mã tài liệu
	public void timMaTL(String maTL_123) {
		for (TaiLieu tl_123 : dstl_123) {
			if (maTL_123.equals(tl_123.getMaTaiLieu())) {
				tl_123.hienThiThongTin();
			}
		}
	}

	// tìm kiếm theo loại tài liệu
	public void timLoaiTL(String loai_123) {
		for (TaiLieu tl_123 : dstl_123) {
			if (loai_123.equals("Sach") && (tl_123 instanceof Sach)) {
				tl_123.hienThiThongTin();
			} else if (loai_123.equals("TapChi") && (tl_123 instanceof TapChi)) {
				tl_123.hienThiThongTin();
			} else if (loai_123.equals("Bao") && (tl_123 instanceof Bao)) {
				tl_123.hienThiThongTin();
			}
		}
	}
}
