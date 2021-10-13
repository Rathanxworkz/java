class handBag{
	String color;
	String price;
	String brand;
	int size;
	String material;
	float capacity;
	
	handBag(String color,String price){
		System.out.println("handBag1 invoked");
		String Color=color;
		String Price=price;
		System.out.println(Color);
		System.out.println(Price);		
	 }
	 
	 
	handBag(){
	    System.out.println("handBag2 invoked");
	}
	 
	handBag(float capacity){
	    System.out.println("handBag3 invoked");
		System.out.println(capacity);
		}
		
	
	handBag(String material){
	    System.out.println("handBag4 invoked");
		System.out.println(material);
		}		
		
	handBag(int size){
	    System.out.println("handBag5 invoked");
		System.out.println(size);
		}
		
		
	handBag(String brand,int size){
	    System.out.println("handBag6 invoked");
		System.out.println(brand,size);
		}
		
	handBag(String color){
	    System.out.println("handBag7 invoked");
		System.out.println(color);
		}
		
	handBag(String size,String brand){
	    System.out.println("handBag8 invoked");
		System.out.println(size,brand);
		}
		
	handBag(String price,String material){
	    System.out.println("handBag9 invoked");
		System.out.println(price,material);
		}
		
	handBag(String capacity,String color){
	    System.out.println("handBag10 invoked");
		System.out.println(capacity,color);
		}	
	 
	 
}