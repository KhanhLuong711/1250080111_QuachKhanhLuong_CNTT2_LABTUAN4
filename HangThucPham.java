package labtuan4;
import java.util.Scanner;
class HangThucPham extends HangHoa {
    private String ngaySanXuat;
    private String ngayHetHan;

    public HangThucPham() {
        super();
        this.ngaySanXuat = "";
        this.ngayHetHan = "";
    }

    public HangThucPham(String maHang, String tenHang, long donGia, String ngaySanXuat, String ngayHetHan) {
        super(maHang, tenHang, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma hang: ");
        String maHang = scanner.nextLine();
        System.out.print("Nhap ten hang: ");
        String tenHang = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        long donGia = scanner.nextLong();
        scanner.nextLine(); 

        System.out.print("Nhap ngay san xuat: ");
        ngaySanXuat = scanner.nextLine();
        System.out.print("Nhap ngay het han: ");
        ngayHetHan = scanner.nextLine();

        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
    }
    public void xuat() {
        System.out.println("Ma hang: " + getMaHang());
        System.out.println("Ten hang: " + getTenHang());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Ngay san xuat: " + ngaySanXuat);
        System.out.println("Ngay het han: " + ngayHetHan);
    }
}
