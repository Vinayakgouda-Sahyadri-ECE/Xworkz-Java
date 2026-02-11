class DishWasher{


static boolean isConnected;


static boolean onOrOff(){


	if(isConnected==false){
		isConnected=true;
		System.out.println("Dish Washer is turned on...");
	}
	
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Dish Washer is turned off...");
	}
	
	return isConnected;


} 


}