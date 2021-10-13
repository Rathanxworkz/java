class Bicycle{
	String color="red";
	int price;
	String brand;
	BicycleLang type=BicycleLang.Electricbicycle;
	
	Bicycle(int price,String brand){
		this.price=price;
		this.brand=brand;
	}
	
	void brake(){
		System.out.println("invokes break");
	}
	
	void move(){
		System.out.println("invokes move");
	}
	
	void displayDetails(){
		System.out.println("Bicycle color is :"+color);
		System.out.println("Bicycle price is :"+price);
		System.out.println("Bicycle brand is :"+brand);
		System.out.println("Bicycle type is :"+type);
	}
	
}