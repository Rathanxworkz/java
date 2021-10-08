class speaker{
	public Static void volume(int level){
		if(level<=3){
			System.out.println('ok');
			}
		else if(level>3){
			System.out.println('loud');
			}
		else if(level>5){
			System.out.println('too long');
			}
		else if(level>5){
			System.out.println('call police');
			}
	
	}
	
	public Static boolean turnOn(){
		System.out.println('invoked start');
		return true;
		}
		
	public Static boolean turnOff(){
		System.out.println('invoked off');
		return false;
		}
}


			