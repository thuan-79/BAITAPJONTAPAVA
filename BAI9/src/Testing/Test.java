package Testing;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

	public static void main(String[] args_123) {
		Scanner sc_123 = new Scanner(System.in);

		QuanLy ql_123 = new QuanLy();

		ql_123.nhapDanhSach(sc_123);

		System.out.println("Danh sách sinh viên trả sách vào cuối tháng:");
		ql_123.hienThiDanhSachTraCuoiThang();

		sc_123.close();
	}
}