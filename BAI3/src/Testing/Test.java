package Testing;

import java.util.Scanner;

import Class.QuanLySach;

public class Test {

	public static void main(String[] args) {
		Scanner sc_123 = new Scanner(System.in);

		QuanLySach qls_123 = new QuanLySach();

		qls_123.nhapDanhSachTL(sc_123);

		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai_123 = sc_123.nextLine();
		qls_123.timLoaiTL(loai_123);

		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTL_123 = sc_123.nextLine();
		qls_123.timMaTL(maTL_123);

		sc_123.close();
	}

}
