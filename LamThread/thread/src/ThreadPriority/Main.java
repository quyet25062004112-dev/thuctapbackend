package ThreadPriority;

public class Main extends Thread{
  @Override
    public void run() {
      for(int i=0;i<5;i++){
          System.out.println(this.getName()+" "+i);
      }
  }
  public static void main(String[] args) {
      Main m1=new Main();
      Main m2=new Main();
      Main m3=new Main();

      m1.setName("A");
      m2.setName("B");
      m3.setName("C");

      m1.setPriority(1);
      m2.setPriority(10);
      m3.setPriority(5);

      m1.start();
      m2.start();
      m3.start();

  }
}
