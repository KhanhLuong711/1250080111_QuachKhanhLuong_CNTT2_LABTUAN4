package labtuan4;
class HangHoa {
private String maHang;
private String tenHang;
private long donGia;

public HangHoa() {
this.maHang = "";
this.tenHang = "";
this.donGia = 0;
}

public HangHoa(String maHang, String tenHang, long donGia) {
this.maHang = maHang;
this.tenHang = tenHang;
this.donGia = donGia;
}

public String getMaHang() {
return maHang;
}

public String getTenHang() {
return tenHang;
}

public long getDonGia() {
return donGia;
}
}