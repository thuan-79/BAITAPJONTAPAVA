package Testing;

import java.util.Scanner;
import Class.QLCB;

public class Test {

	public static void main(String[] args) {
		Scanner sc_116 = new Scanner(System.in);

		QLCB qlcb_116 = new QLCB();

		qlcb_116.nhapDanhSach(sc_116);

		System.out.print("Nhap vao ho ten can tim kiem: ");
		String name_116 = sc_116.nextLine();

		qlcb_116.timKiemCanBo(name_116);

		// huy sc
		sc_116.close();
	}

}
