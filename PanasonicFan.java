class PanasonicFan{


static boolean isConnected;


static boolean onOrOff(){


	if(isConnected==false){
		isConnected=true;
		System.out.println("Panasonic Fan is turned on...");
	}
	
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Panasonic Fan is turned off...");
	}
	
	return isConnected;


} 


}