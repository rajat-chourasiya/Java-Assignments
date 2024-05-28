import static java.lang.System.out;
class Cust{
  int amounts = 10000;
  synchronized void withdraw(int amoun){
    out.println("Going to withdraw .... ");
  
  if (this.amounts < amoun){
    out.println("Less balance : waiting for deposit .... ");
    try{wait();}catch(Exception e){}
  }
  this.amounts -= amoun;
  out.println("Withdraw completed ....");
  }
  synchronized void deposit(int amount){
    out.println("Going to deposit ....");
    this.amounts += amount;
    out.println("Deposit completed ");
    notify();
  }
}
class ProducerConsumer{
  public static void main(String[] args){
    final Cust c = new Cust();
    new Thread(){
    public void run(){c.withdraw(15000);}
    }.start();
    new Thread(){
    public void run(){c.deposit(20000);}
    }.start();
  }
}
