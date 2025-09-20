package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
    // thuoc tinh
    private String mon1_123;
    private String mon2_123;
    private String mon3_123;

    // phuong thuc
    // ham khoi tao khong doi so
    public KhoiA() {

    }

    // ham khoi tao co doi so
    public KhoiA(String mon1_123, String mon2_123, String mon3_123) {
        this.mon1_123 = mon1_123;
        this.mon2_123 = mon2_123;
        this.mon3_123 = mon3_123;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc_123) {
        super.nhapThongTin(sc_123);
        System.out.print("\tNhap mon 1: ");
        mon1_123 = sc_123.nextLine();
        System.out.print("\tNhap mon 2: ");
        mon2_123 = sc_123.nextLine();
        System.out.print("\tNhap mon 3: ");
        mon3_123 = sc_123.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTo hop mon thi: " + mon1_123 + " - " + mon2_123 + " - " + mon3_123);
    }
}
