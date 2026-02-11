class WashingMachine{


static boolean isConnected;


static boolean onOrOff(){


	if(isConnected==false){
		isConnected=true;
		System.out.println("Washing Machine is turned on...");
	}
	
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Washing Machine is turned off...");
	}
	
	return isConnected;


} 


}