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
	Node start = null;
	void push(int v){
		Node n = new Node(v);
		if (start == null){
			start = n;
		}
		else{
			Node temp = start;
			while (temp.next != null ){
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	void travarse(){
		Node tem = start;
		while (tem != null){
			out.println(tem.info);
			tem = tem.next;
		}
		
	}
}
class Linkedlist{
	public static void main(String[] args){
		Llist ob = new Llist();
		ob.push(20);
		ob.push(22);
		ob.travarse();
	}
}