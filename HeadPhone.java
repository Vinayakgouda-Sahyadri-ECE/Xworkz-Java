class HeadPhone{


static boolean isConnected=true;


static boolean onOrOff(){


	if(isConnected==false){
		isConnected=true;
		System.out.println("Headphone is turned on...");
	}
	
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Headphone is turned off...");
	}
	
	return isConnected;


} 


}