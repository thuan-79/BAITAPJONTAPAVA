package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    // thuoc tinh
    private ArrayList<ThiSinh> dsts_123;

    // phuong thuc
    public TuyenSinh() {
        dsts_123 = new ArrayList<ThiSinh>(10);
    }

    // ham them 1 thi sinh
    public void themThiSinh(ThiSinh ts_123) {
        dsts_123.add(ts_123);
    }

    // nhap danh sach
    public void nhapDanhSach(Scanner sc_123) {
        ThiSinh ts_123;
        int chon_123;

        System.out.print("Nhap vao so luong thi sinh: ");
        int n_123 = sc_123.nextInt();
        sc_123.nextLine();

        for (int i = 0; i < n_123; i++) {
            System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
            chon_123 = sc_123.nextInt();

            switch (chon_123) {
            case 1:
                ts_123 = new KhoiA("Toan", "Ly", "Hoa");
                break;
            case 2:
                ts_123 = new KhoiB("Toan", "Hoa", "Sinh");
                break;
            case 3:
                ts_123 = new KhoiC("Van", "Su", "Dia");
                break;
            default:
                ts_123 = new KhoiA("Toan", "Ly", "Hoa");
                break;
            }

            ts_123.nhapThongTin(sc_123);
            themThiSinh(ts_123);
        }
    }

    // ham hien thi
    public void hienThiDanhSach() {
        int n_123 = dsts_123.size();
        for (int i = 0; i < n_123; i++) {
            System.out.println("Thi sinh thu " + (i + 1) + " la:");
            dsts_123.get(i).hienThiThongTin();
        }
    }

    // tim kiem thi sinh theo so bao danh
    public void timKiemThiSinh(int soBaoDanh_123) {
        for (ThiSinh ts_123 : dsts_123) {
            if (ts_123.getSoBD_123() == soBaoDanh_123) {
                ts_123.hienThiThongTin();
            }
        }
    }
}
