class VideoGameConsole{


static boolean isConnected=true;


static boolean onOrOff(){


	if(isConnected==false){
		isConnected=true;
		System.out.println("Video Game Console is turned on...");
	}
	
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Video Game Console is turned off...");
	}
	
	return isConnected;


} 


}