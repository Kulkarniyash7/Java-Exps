import java.util.Scanner ;

class SQ {
  void stk (){

System.out.println("Enter 1 if you want stack or 2 for queue ");
Scanner sc = new Scanner(System.in);
int x ;
      x=sc.nextInt();
 	if (x == 1){
		stack();
	 }
	if(x == 2){
		 queue();
	}



}
 void  stack(){
	Scanner sc = new Scanner(System.in);
	int size,i;
	int p=0,r;
	System.out.println("Enter How Big Stack");
	size = sc.nextInt();
      int a[]= new int[size];
	System.out.println("Options = 1.Push \t 2.Pop");
   	int o = sc.nextInt();
      	
		switch(o){
			case 1 : System.out.println("Enter the element you want to push");
				a[p]=sc.nextInt();
				p=p+1;

			case 2 : System.out.println("The last element is being poped wait . . . 3 2 1 . . . Succesfully Poped");
				a[p]=0;
				p=p-1;
			 }


	}

void queue(){

}

}