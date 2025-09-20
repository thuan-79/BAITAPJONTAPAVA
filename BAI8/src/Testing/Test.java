package Testing;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

	public static void main(String[] args_123) {
		Scanner sc_123 = new Scanner(System.in);

		QuanLy ql_123 = new QuanLy();

		ql_123.nhapDanhSach(sc_123);

		System.out.println("\nDanh sách những cán bộ có lương >= 8 triệu là:");
		ql_123.timKiem(8000000);

		sc_123.close();
	}

}