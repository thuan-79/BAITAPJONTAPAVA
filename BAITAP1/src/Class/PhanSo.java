package Class;

import java.util.Scanner;

public class PhanSo {
	// thuộc tính
	private int tuSo_123;
	private int mauSo_123;

	// hàm khởi tạo không đối số
	public PhanSo() {
		tuSo_123 = 0;
		mauSo_123 = 1;
	}

	// hàm khởi tạo có đối số
	public PhanSo(int tuSo_123, int mauSo_123) {
		this.tuSo_123 = tuSo_123;
		this.mauSo_123 = mauSo_123;
	}

	// hàm nhập phân số
	public void nhapPS(Scanner sc) {
		int a_123;
		int b_123;

		do {
			System.out.print("\tNhap vao tu so: ");
			a_123 = sc.nextInt();

			System.out.print("\tNhap vao mau so: ");
			b_123 = sc.nextInt();

			// kiểm tra
			if (b_123 == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tuSo_123 = a_123;
				mauSo_123 = b_123;
			}
		} while (b_123 == 0);
	}

	// hàm hiển thị
	public void hienThiPS() {
		if (tuSo_123 * mauSo_123 < 0) {
			System.out.println("\t-" + Math.abs(tuSo_123) + "/" + Math.abs(mauSo_123));
		} else {
			System.out.println("\t" + Math.abs(tuSo_123) + "/" + Math.abs(mauSo_123));
		}
	}

	// hàm cộng
	public PhanSo congPS(PhanSo ps2) {
		int a_123 = tuSo_123 * ps2.mauSo_123 + ps2.tuSo_123 * mauSo_123;
		int b_123 = mauSo_123 * ps2.mauSo_123;

		return new PhanSo(a_123, b_123);
	}

	// hàm trừ
	public PhanSo truPS(PhanSo ps2) {
		int a_123 = tuSo_123 * ps2.mauSo_123 - ps2.tuSo_123 * mauSo_123;
		int b_123 = mauSo_123 * ps2.mauSo_123;

		return new PhanSo(a_123, b_123);
	}

	// hàm nhân
	public PhanSo nhanPS(PhanSo ps2) {
		int a_123 = tuSo_123 * ps2.tuSo_123;
		int b_123 = mauSo_123 * ps2.mauSo_123;

		return new PhanSo(a_123, b_123);
	}

	// hàm chia
	public PhanSo chiaPS(PhanSo ps2) {
		int a_123 = tuSo_123 * ps2.mauSo_123;
		int b_123 = mauSo_123 * ps2.tuSo_123;

		return new PhanSo(a_123, b_123);
	}

	// hàm tìm USCLN
	private int timUSCLN(int a_123, int b_123) {
		int r_123 = a_123 % b_123;

		while (r_123 != 0) {
			a_123 = b_123;
			b_123 = r_123;
			r_123 = a_123 % b_123;
		}

		return b_123;
	}

	// hàm kiểm tra phân số tối giản hay chưa
	public boolean kiemTraToiGian() {
		if (timUSCLN(tuSo_123, mauSo_123) == 1) {
			return true;
		}
		return false;
	}

	// hàm tối giản
	public void toiGianPS() {
		int x_123 = timUSCLN(tuSo_123, mauSo_123);

		tuSo_123 /= x_123;
		mauSo_123 /= x_123;
	}
}
