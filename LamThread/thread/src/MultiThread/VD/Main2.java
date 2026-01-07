package MultiThread.VD;

class NhanVien{
    void nhanvien(){

        for(int j=0;j<10;j++){
            System.out.println("B" +j);
        }
        System.out.println("Nhan vien thư 1 ");
    }
    void sep(){
        System.out.println("sep lơn");
    }

}
class GiamDoc extends NhanVien{
    void giamdoc(){
        nhanvien();
        sep();
        System.out.println("giam doc tong");
    }

}

class ChucVu extends GiamDoc implements Runnable{
    @Override
    public void run() {
        giamdoc();

        System.out.println("chuc vu cao");
    }
}


public class Main2 {
    public static void main(String[] args) {
        ChucVu chucvu = new ChucVu();
        Thread t1 = new Thread(chucvu);
        t1.start();


    }
}

