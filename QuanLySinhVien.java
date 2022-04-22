package BaiTapQuanLySinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
	public static void main(String[] args) {
		ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
		
		SinhVien sv = new SinhVien();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		sv.setTen(sc.next());
		System.out.print("Nhập mã sinh viên: ");
		sv.setMaSV(sc.next());
		System.out.print("Nhập điểm môn Toán: ");
		sv.setDiemToan(sc.nextFloat());
		System.out.print("Nhập điểm môn Lý ");
		sv.setDiemLy(sc.nextFloat());
		System.out.print("Nhập điểm môn Hóa ");
		sv.setDiemHoa(sc.nextFloat());
		
		listSV.add(sv);
		
		sv.tinhDiemTB();
	}
}
