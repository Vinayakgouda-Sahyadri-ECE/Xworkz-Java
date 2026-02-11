class Oven{


static boolean isConnected;


static boolean onOrOff(){


	if(isConnected==false){
		isConnected=true;
		System.out.println("Oven is turned on...");
	}
	
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Oven is turned off...");
	}
	
	return isConnected;


} 


}