package Testing;

import java.util.Scanner;
import Class.KhachSan;

public class Test {
    public static void main(String[] args_123) {
        Scanner sc_123 = new Scanner(System.in);

        KhachSan ql_123 = new KhachSan();

        // Nhập danh sách khách trọ
        ql_123.nhapDanhSach(sc_123);

        // Thêm một dòng trống để dễ đọc hơn
        System.out.println(); 

        System.out.print("Nhập vào CMND của khách trọ cần tính tiền: ");
        // Lỗi đã được sửa ở đây: đọc CMND dưới dạng chuỗi (String)
        String cmnd_123 = sc_123.nextLine();

        double tongTien_123 = ql_123.tinhTien(cmnd_123);
        
        System.out.println("==> Tổng tiền là: " + tongTien_123);

        sc_123.close();
    }
}
