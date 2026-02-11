class SonyTv{


static boolean isConnected=true;


static boolean onOrOff(){


	if(isConnected==false){
		isConnected=true;
		System.out.println("Sony Tv is turned on...");
	}
	
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Sony Tv is turned off...");
	}
	
	return isConnected;


} 


}