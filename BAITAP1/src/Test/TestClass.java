package Test;

import java.util.Scanner;
import Class.PhanSo;

public class TestClass {

    public static void main(String[] args) {
        Scanner sc_123 = new Scanner(System.in);
        PhanSo ps1_123 = new PhanSo();
        PhanSo ps2_123 = new PhanSo();
        PhanSo psTong_123 = new PhanSo();

        // nhap phan so
        System.out.println("Nhap vao phan so thu nhat:");
        ps1_123.nhapPS(sc_123);
        System.out.println("Nhap vao phan so thu hai:");
        ps2_123.nhapPS(sc_123);

        // tinh tong 2 phan so
        psTong_123 = ps1_123.congPS(ps2_123);

        // hien thi phan so
        System.out.println("\nPhan so thu nhat la:");
        ps1_123.hienThiPS();
        System.out.println("\nPhan so thu hai la:");
        ps2_123.hienThiPS();
        System.out.println("\nPhan so tong la:");
        psTong_123.hienThiPS();

        sc_123.close();
    }
}
