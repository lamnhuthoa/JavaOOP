import java.util.ArrayList;

public class NhanVien {
	protected String maSo;
	protected String hoTen;
	protected String soDienThoai;
	protected int soNgayLamViec;
	protected int luongMotNgay;
	
	public NhanVien() {};
	
	protected int tongLuong() {
		return 0;
	}
	
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}
	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	public int getLuongMotNgay() {
		return luongMotNgay;
	}
	public void setLuongMotNgay(int luongMotNgay) {
		this.luongMotNgay = luongMotNgay;
	}
}
