package Testing;

import java.util.Scanner;
import Class.TuyenSinh;

public class Test {

    public static void main(String[] args) {
        Scanner sc_123 = new Scanner(System.in);

        TuyenSinh dsTuyenSinh_123 = new TuyenSinh();

        System.out.println("Nhap vao danh sach thi sinh: ");
        dsTuyenSinh_123.nhapDanhSach(sc_123);

        System.out.println("Danh sach thi sinh du thi la:");
        dsTuyenSinh_123.hienThiDanhSach();

        System.out.print("Nhap so bao danh can tim: ");
        int soBaoDanh_123 = sc_123.nextInt();
        sc_123.nextLine();

        dsTuyenSinh_123.timKiemThiSinh(soBaoDanh_123);

        sc_123.close();
    }

}
