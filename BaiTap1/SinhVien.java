package BaiTap1;

public class SinhVien {
    //Bien toan cuc
	String Hoten = "Phan Huu Chinh";

	//Bien Static
    static String GioiTinh = "Nam";

	//Bien cuc bo
    public void BienCucBo(){
        String XepHang = "Dat";
        System.out.println("Xep hang:" + XepHang );
    }

    public static void main(String[] args)
	{
        SinhVien SV = new SinhVien();
		SV.BienCucBo();

        //In ra
        System.out.println("Ten: " + SV.Hoten);
        System.out.println("Gioi tinh: " + SinhVien.GioiTinh);
        System.out.println("Que quan: " + ThongTIn.QueQuan);
        System.out.println("Ten: " + ThongTIn.Truong);
    }
}
