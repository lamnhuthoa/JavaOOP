package BaiTapQuanLySinhVien;

public class SinhVien {
	private String ten;
	private String maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	
	public SinhVien() {}
	
	public void tinhDiemTB() {
		float diemTB = (this.diemToan + this.diemLy + this.diemHoa)/3;
		System.out.println("Điểm trung bình của sinh viên " + this.ten + " là: " + diemTB);
		if(diemTB >= 9 && diemTB <= 10) {
			System.out.println("Sinh viên " + this.ten + " là học sinh xuất sắc");
		} else if (diemTB >= 8 && diemTB < 9) {
			System.out.println("Sinh viên " + this.ten + " là học sinh giỏi");
		} else if (diemTB >= 7 && diemTB < 8) {
			System.out.println("Sinh viên " + this.ten + " là học sinh khá");
		} else if (diemTB >= 6 && diemTB < 7) {
			System.out.println("Sinh viên " + this.ten + " là học sinh trung bình khá");
		} else if (diemTB >= 5 && diemTB < 6) {
			System.out.println("Sinh viên " + this.ten + " là học sinh trung bình");
		} else {
			System.out.println("Sinh viên " + this.ten + " là học sinh trung yếu");
		}
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
}
