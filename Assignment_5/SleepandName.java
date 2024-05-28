import java.io.*;
import static java.lang.System.out;
class Sleep extends Thread{
  public void run(){
    try{
      for (int i=1; i<= 11; i++){
        sleep(1000);
        if(i == 4){
          sleep(5000);
        }
        out.println(Thread.currentThread().getName() +" is running and value of i "+i+" and current Thread is "+Thread.currentThread());
      }
    }catch(Exception e){}
    
  }
}
class SleepandName{
  public static void main(String[] args){
    Sleep Ts = new Sleep();
    Ts.setName("MyThread ");
    Ts.start();
  }
}
