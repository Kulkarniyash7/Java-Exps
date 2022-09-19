class UnBox{
	public static void main(String[]args){
	double d=1005647895;
	int i= (int)d;
	short s = (short)i;
	byte b= (byte)s;
	
	System.out.println("Double"+d);
	System.out.println("int "+i +" short "+s + " byte "+b);
	
	}

}