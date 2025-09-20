package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	// thuoc tinh
	private ArrayList<CanBo> dscb_116;

	// phuong thuc
	// ham khoi tao
	public QLCB() {
		dscb_116 = new ArrayList<CanBo>(10);
	}

	// ham them can bo
	public void themCanBo(CanBo cb_116) {
		dscb_116.add(cb_116);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc_116) {
		CanBo cb_116;
		System.out.print("Nhap vao so luong can bo: ");
		int n_116 = sc_116.nextInt();
		sc_116.nextLine();

		System.out.println("Nhap thong tin chi tiet:");
		for (int i_116 = 0; i_116 < n_116; i_116++) {
			System.out.println("Lan nhap thu " + (i_116 + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien; 3-CongNhan): ");
			int chon_116 = sc_116.nextInt();
			sc_116.nextLine();

			cb_116 = new CanBo();

			switch (chon_116) {
			case 1:
				cb_116 = new KySu();
				break;
			case 2:
				cb_116 = new NhanVien();
				break;
			case 3:
				cb_116 = new CongNhan();
				break;
			default:
				cb_116 = new KySu();
				break;
			}

			// sau khi chon loai can bo thi nhap thong tin cho can bo do
			cb_116.nhapThongTin(sc_116);

			// nhap xong roi thi them can bo vao danh sach
			themCanBo(cb_116);
		}
	}

	// ham tim kiem theo ten
	public void timKiemCanBo(String hoTen_116) {
		for (CanBo cb_116 : dscb_116) {
			if (hoTen_116.equals(cb_116.getHoTen())) {
				cb_116.hienThiThongTin();
			}
		}
	}
}
