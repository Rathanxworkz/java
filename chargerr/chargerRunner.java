class chargerRunner{
	public static void main(String[] values){
		
		Charger conv=new Charger();		
		System.out.println(conv.company);
		System.out.println(conv.price);
		
		Charger conv1=new Charger();		
		System.out.println(conv1.capacity);
		System.out.println(conv1.color);


		conv.price=800;
		conv1.capacity="35wt";
		
		System.out.println(conv.price);
		System.out.println(conv1.capacity);

		
		
	}
}