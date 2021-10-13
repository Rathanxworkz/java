class lighter{
	public static boolean onMethod(){
		System.out.println("turn on");
		return true;
	}
	
	public static boolean offMethod(){
		System.out.println("turn of");
		return false;
	}
	
	public static boolean light(int width){
		if(width>0){
			System.out.println("greater");
			return true;
			}
		else{
			System.out.println("turn off");
			return false;
		}
		
	}
	}