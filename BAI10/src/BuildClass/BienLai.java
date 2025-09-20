package BuildClass;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuộc tính
	private int chiSoMoi_123;
	private int chiSoCu_123;
	private double tien_123;

	// Phương thức
	// Hàm khởi tạo không đối số
	public BienLai() {
		// Dòng này gọi constructor mặc định của KhachHang
		super(); 
	}

	// Hàm khởi tạo có đối số
	public BienLai(String tenChuHo_123, int chiSoMoi_123, int chiSoCu_123) {
		// Gọi constructor của lớp cha để gán giá trị cho tenChuHo
		super(tenChuHo_123, 0, ""); 
		// Lưu ý: constructor của lớp cha KhachHang cần nhận 3 tham số.
		// Bạn phải thêm các giá trị mặc định cho soNha và maCongTo.
		
		this.chiSoMoi_123 = chiSoMoi_123;
		this.chiSoCu_123 = chiSoCu_123;
		this.tien_123 = (this.chiSoMoi_123 - this.chiSoCu_123) * 750;
	}

	// Hàm nhập
	public void nhapThongTin(Scanner sc_123) {
		super.nhapThongTin(sc_123);
		System.out.print("\tNhập chỉ số mới: ");
		chiSoMoi_123 = sc_123.nextInt();
		sc_123.nextLine();
		System.out.print("\tNhập chỉ số cũ: ");
		chiSoCu_123 = sc_123.nextInt();
		sc_123.nextLine();
		tien_123 = (chiSoMoi_123 - chiSoCu_123) * 750;
	}

	// Hàm hiển thị
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChỉ số mới: " + chiSoMoi_123);
		System.out.println("\tChỉ số cũ: " + chiSoCu_123);
		System.out.println("\tTiền: " + tien_123);
	}
}