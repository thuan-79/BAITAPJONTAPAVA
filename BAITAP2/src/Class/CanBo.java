package Class;
import java.util.Scanner;
public class CanBo {
	// thuoc tinh
	private String hoTen_116;
	private String ngaySinh_116;
	private String gioiTinh_116;
	private String diaChi_116;
	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {
	}
	// ham khoi tao co doi so
	public CanBo(String hoTen_116, String ngaySinh_116, String gioiTinh_116, String diaChi_116) {
		this.hoTen_116 = hoTen_116;
		this.ngaySinh_116 = ngaySinh_116;
		this.gioiTinh_116 = gioiTinh_116;
		this.diaChi_116 = diaChi_116;
	}
	// ham nhap
	public void nhapThongTin(Scanner sc_116) {
		System.out.print("\tNhap ho ten: ");
		hoTen_116 = sc_116.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh_116 = sc_116.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh_116 = sc_116.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_116 = sc_116.nextLine();
	}
	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_116);
		System.out.println("\tNgay sinh: " + ngaySinh_116);
		System.out.println("\tGioi tinh: " + gioiTinh_116);
		System.out.println("\tDia chi: " + diaChi_116);
	}
	// ham lay thong tin ho ten
	public String getHoTen() {
		return this.hoTen_116;
	}
}
