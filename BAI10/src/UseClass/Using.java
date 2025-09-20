package UseClass;

import java.util.Scanner;

import BuildClass.QuanLy;

public class Using {

	public static void main(String[] args_123) {
		Scanner sc_123 = new Scanner(System.in);

		QuanLy ql_123 = new QuanLy();
		ql_123.nhapDanhSach(sc_123);

		System.out.println("Danh sách biên lai của các hộ gia đình là:");
		ql_123.hienThiDanhSach();

		sc_123.close();
	}

}