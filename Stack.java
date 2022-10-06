import java.util.Scanner ;


interface Stack {
 	void push (int pointer);
 	void pop (int pointer);
	void display (int pointer); 
}
class Test implements Stack{
	int x;
	int top = 0;

	int pointer = 0;
	int a[];
	Test()
	{
	
	System.out.println("Enter the size of Stack ");
	Scanner sc = new Scanner (System.in);
	int x = sc.nextInt();
	
	int a[]= new int [x];
	}
	public void push(int data){
		if(top==x){
		System.out.println(" Stack Is Full ");
		}
		else {
		a[top] = sc.nextInt();
		top = top +1 ;
		}
		
	}
	public void pop(){

	if(pointer == 0){
	System.out.println("Stack Is EMPTY " );
	}
	
	else{
	a[top]=0;
	top =top - 1; 
	}
	
	}

	public void display (){
	int i ;
	for(i=0;i<pointer;i++){
	System.out.println(a[i]);
	}
	
	}

}
class Main {

public static void main (String[] Args){
Scanner sb = new Scanner(System.in);
Test s1 = new Test();
System.out.println("Enter 1 for STACK \n 2 for QUEUE ");
int o;
int temp ;
temp = sb.nextInt();

	if (temp == 1){
	
	System.out.println("1. Push \n 2. pop \n 3.Display");
	o = sb.nextInt();	
	switch (o){
		case 1 :System.out.println("Enter the Data to be pushed ");
				int data = sb.nextInt(); 
				s1.push(data);
			break;
		case 2 : s1.pop();
			break;
		case 3 : s1.display();
			break;
		}
	
	
	}

}


}
