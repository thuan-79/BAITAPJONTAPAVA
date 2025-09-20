package BuildClass;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    // Thuộc tính
    private ArrayList<BienLai> danhSach;

    // Phương thức
    // Hàm khởi tạo
    public QuanLy() {
        danhSach = new ArrayList<BienLai>();
    }

    // Hàm thêm biên lai vào danh sách
    public void themBienLai(BienLai bienLai) {
        danhSach.add(bienLai);
    }

    // Hàm nhập danh sách
    public void nhapDanhSach(Scanner scanner) {
        System.out.print("Nhập vào số lượng biên lai: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Xử lý dòng thừa sau khi nhập số

        System.out.println("Nhập vào danh sách biên lai:");
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Biên lai thứ " + (i + 1) + " là:");
            BienLai bienLai = new BienLai();
            bienLai.nhapThongTin(scanner);
            themBienLai(bienLai);
        }
    }

    // Hàm hiển thị danh sách
    public void hienThiDanhSach() {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("Biên lai thứ " + (i + 1) + " là:");
            danhSach.get(i).hienThiThongTin();
            System.out.println();
        }
    }
}