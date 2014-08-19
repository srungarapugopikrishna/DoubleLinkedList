
public class DoubleLinkedList {
	class DoubleLinkedListData{
		int data;
		DoubleLinkedListData previous;
		DoubleLinkedListData next; 
	}
	private DoubleLinkedListData head,tail;
	public boolean Enque(int data){
		if(head == null){
			head = new DoubleLinkedListData();
			head.next = null;
			head.previous=null;
			// EnQued the data
			head.data = data;
		}else{
			DoubleLinkedListData temp = head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next = new DoubleLinkedListData();
			tail=temp.next;
			
			// EnQued the data
			tail.data = data;
			tail.previous=temp;
			tail.next = null;
			 
		}
		return true;
	}
	public void displayQ(){
		System.out.println("-----Head To Tail-----");
		if(head!=null){
			DoubleLinkedListData temp=head;
			while(temp.next!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
				System.out.println(temp.data);
		}
		else{	
				System.out.println("Q is Empty");
			}
		System.out.println("-----Tail To Head-----");
		if(tail!=null){
			DoubleLinkedListData temp=tail;
			while(temp.previous!=null){
				System.out.println(temp.data);
				temp=temp.previous;
			}
				System.out.println(temp.data);
		}
		else{	
				System.out.println("Q is Empty");
			}
	 }
	public int DeQueFirstNode() throws Exception{
		if(head!=null){
			DoubleLinkedListData temp=head.next;
			int dequedData=head.data;
			head.next=null;
			head=temp;
			temp.previous=null;
			return dequedData;
		}
		else{
			throw new Exception("Queue is Empty. Cannot Deque");
		}
	}
	public int DeQueLastNode() throws Exception{
		if(head!=null){
			DoubleLinkedListData temp=head;
			DoubleLinkedListData tempPre = null;
			while(temp.next!=null){
				tempPre=temp;
 				temp=temp.next;
			}
			int dequedData=temp.data;
			if(tempPre!=null){
				tempPre.next=null;
				temp.previous=null;
				tail=tempPre;
			}
			else{
				head=null;
			}
			return dequedData;
		}
		else{
			throw new Exception("Queue is Empty. Cannot Deque");
		}
	}
	public int DeQueElementAtPostion(int position) {
		if(head!=null){
			if(position==1){
				try {
					DeQueFirstNode();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else{
				int i=2;
				DoubleLinkedListData tempPre = null;
				DoubleLinkedListData tempNxt = null;
				DoubleLinkedListData temp=head.next;tempPre=head;
				while(temp!=null){
					int dequedData=temp.data;
					System.out.println(temp.data);
					if(i==position){
						tempNxt=temp.next;
						tempPre.next=tempNxt;
						tempNxt.previous=tempPre;
						temp=null;
						return dequedData; 
					}
					tempPre=temp;
					temp=temp.next;
					i++;
				}
			}
		}
		else{	
				System.out.println("Q is Empty");
			}
		return -1;
	}
	public boolean EnqueAtFirst(int data) {
		if(head == null){
			head = new DoubleLinkedListData();
			head.next = null;
			// EnQued the data
			head.data = data;
		}else{
			DoubleLinkedListData temp=new DoubleLinkedListData();
			temp.data=data;
			temp.next=head;
			head.previous=temp;
			head=temp;
		}
		return true;
	}
	public boolean EnqueAtPosition(int position, int data) {
		if(position==1){
			EnqueAtFirst(data);
		}
		else{
			DoubleLinkedListData tempPre,tempCurr=head.next;
			DoubleLinkedListData temp=new DoubleLinkedListData();
			temp.data=data;tempPre=tempCurr;
			int i=2;
			while(tempCurr.next!=null){
				if(i==position){
					tempPre.next=temp;
					temp.previous=tempPre;
					temp.next=tempCurr;
					tempCurr.previous=temp;
					return true;
				}
				tempPre=tempCurr;
				tempCurr=tempCurr.next;
				i++;
			}
		}
		return true;
	}
}
