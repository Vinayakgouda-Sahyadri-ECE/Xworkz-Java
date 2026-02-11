class AppleWatch{


static boolean isConnected=true;


static boolean onOrOff(){


	if(isConnected==false){
		isConnected=true;
		System.out.println("Apple Watch is turned on...");
	}
	
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Apple Watch is turned off...");
	}
	
	return isConnected;


} 


}