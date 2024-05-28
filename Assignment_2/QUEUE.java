import java.io.*;
import static java.lang.System.out;
class queueAdT{
	
	int[] am = new int[10];
	int front = -1 ;
	int rear = -1;
	void insert(int st){
		if ( rear == am.length){
			out.println("Queue is full ");
		}
		rear += 1;
		am[rear] = st;
		if (front == -1 ){
			front = 0;
		}
		out.println(rear+" rear is ");
	}
	void display(){
		for (int i =0 ; i< am.length; i++){
			out.println(am[i]);
		}
	}
	void delete(){
		if (front == -1 && rear == -1){
			out.println("Queue is empty ");
		}
		am[0] = 0;
		if (front == rear ){
			front = -1 ;
			rear = -1;
		}
		else{
			front += 1;
		}
	}
	
}
class QUEUE{
	public static void main(String[] args){
		queueAdT ob = new queueAdT();
		ob.insert(4);
		ob.insert(8);
		ob.display();
		ob.delete();
		out.println("After deleting the front value ");
		ob.display();
	}
}