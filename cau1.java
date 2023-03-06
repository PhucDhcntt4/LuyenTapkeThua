 

 class HoaQua{
 	public void CanNang(){
 		System.out.println("Can nang la ?");
 	}

 	public void GiaBan(){
 		System.out.println("Gia ban la ?");

 	}
 }

 class QuaCam extends HoaQua{
 	public void MauCam(){
 		System.out.println("Co mau cam !");
 	}
 }

 class QuaTao extends HoaQua{
 	public void HatTron(){
 		System.out.println("Co Hat Tron ");
 	}
 }

 class CamCaoPhong extends HoaQua{
 	public void KhongBIetCamNay(){
 		System.out.println("Khong BIet");
 	}
 }

 class CamSanh extends HoaQua{
 	public void MauXanh(){
 		System.out.println("Cao mau Cam ");
 	}
 }

 class main {
	public static void main (String[] args){



		QuaTao tao = new QuaTao();
		tao.CanNang();
		tao.GiaBan();
		tao.HatTron();

		QuaCam cam = new QuaCam();
		cam.CanNang();
		cam.GiaBan();
		cam.MauCam();

		CamCaoPhong cp = new CamCaoPhong();
		cp.GiaBan();
		cp.CanNang();
		cp.KhongBIetCamNay();

		CamSanh cs = new CamSanh();
		cs.CanNang();
		cs.GiaBan();
		cs.MauXanh();

	}
}