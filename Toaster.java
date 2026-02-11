class Toaster{


static boolean isConnected=true;


static boolean onOrOff(){


	if(isConnected==false){
		isConnected=true;
		System.out.println("Toaster is turned on...");
	}
	
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Toaster is turned off...");
	}
	
	return isConnected;


} 


}