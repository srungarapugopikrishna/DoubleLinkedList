import java.util.Scanner;


public class DoubleLinkedListOperations {
	private static Scanner scr;
	public static void main(String[] args){
		DoubleLinkedList Lst=new DoubleLinkedList(); 
		scr = new Scanner(System.in);
		boolean execute=true;
		while(execute){
			System.out.println("Select your choice :\n 1.EnQue\n 2.Display\n 3.DeQue First Element\n 4.DeQue Last Element\n 5.DeQue Element At Position\n 6.EnQue at the First\n 7.EnQue Element At Position\n 8.Exit");
			int inputChoice=scr.nextInt();
			switch(inputChoice){
				case 1:	System.out.println("Enter the number to EnQue");
						int data=scr.nextInt();
						Lst.Enque(data);
						break;
				case 2: Lst.displayQ();
						break;
				case 3:	try{	
							System.out.println("Dequed data is:"+Lst.DeQueFirstNode());
						}
						catch(Exception e){
							e.printStackTrace();
						}
						break;
				case 4:	try{	
							System.out.println("Dequed data is:"+Lst.DeQueLastNode());
						}
						catch(Exception e){
							e.printStackTrace();
						}
						break;
				case 5:	System.out.println("Enter the position to DeQue");
						int position=scr.nextInt();
				 		System.out.println("Dequed data is:"+Lst.DeQueElementAtPostion(position));
						break;	
				case 6: System.out.println("Enter the number to EnQue at the first Position");
						data=scr.nextInt();
						Lst.EnqueAtFirst(data);
						break;
				case 7: System.out.println("Enter the Positon:");
						position=scr.nextInt();
						System.out.println("Enter the number to EnQue:");
						data=scr.nextInt();
						Lst.EnqueAtPosition(position,data);
						break;		
				case 8: execute=false;
			}
		}
	}
}
