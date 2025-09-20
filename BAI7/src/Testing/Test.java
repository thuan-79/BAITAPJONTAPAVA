package Testing;

import java.util.Scanner;
import Class.QLHS;

public class Test {

    public static void main(String[] args_123) {
        Scanner sc_123 = new Scanner(System.in);
        
        QLHS list_123 = new QLHS();
        
        list_123.nhapDanhSachHS(sc_123);
        
        System.out.println("Những học sinh sinh năm 1985 và quê Thái Nguyên là:");
        list_123.timKiemThongTin(1985, "Thái Nguyên");
        
        System.out.println("\nNhững học sinh học lớp 10A1 là:");
        list_123.timKiemThongTin("10A1");
        
        sc_123.close();
    }
}
