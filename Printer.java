class Printer{


static boolean isConnected=true;


static boolean onOrOff(){


	if(isConnected==false){
		isConnected=true;
		System.out.println("Printer is turned on...");
	}
	
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Printer is turned off...");
	}
	
	return isConnected;


} 


}