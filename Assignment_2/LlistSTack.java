import static java.lang.System.out;
class Node{
	int info ;
	Node next;
	Node(int va){
		info = va;
		next = null;
		
	}
}
class Llist{
	Node start ;
	Node top ;
	void push(int v){
		Node n = new Node(v);
		if (start == null){
			start = n;
			top = n;
		}
		else{
			top.next = n;
			top = n;
		}
	}
	void travarse(){
		Node temp = start;
		while (temp != null){
			out.println(temp.info);
			temp = temp.next;
		}
	}
}
class LlistSTack{
	public static void main(String[] args){
		Llist ob = new Llist();
		ob.push(40);
		ob.push(62);
		ob.travarse();
	}
}