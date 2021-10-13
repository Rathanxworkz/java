class BicycleStarter{
	public static void main(String[] values){
		Bicycle ride=new Bicycle(15000,"Decathlon");
		ride.brake();
		ride.move();
		ride.displayDetails();
	}
}