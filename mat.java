import java.util.Scanner;

	 class mat{
	

	int x, y;
	
	
		public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		System.out.println("Give me X");
		x=sc.nextInt();
		System.out.println("Give me Y");
		y=sc.nextInt();
int [][]m=new int[x][y];
			for(int i=0;i<x;i++){
		 		for(int j=0;j<y;j++){
				 m[i][j]= sc.nextInt();
				}
			}
			for( i=0;i<x;i++){
		 		for( j=0;j<y;j++){
				System.out.println(“m=”+m[i][j]);
				}
			}
		}
	}
