class Zerodha{
 static void saveUserAccount(String permanentAccountNumber,long  aadhaarNumber,String address,String bankName){

System.out.println("User PAN number is "+ permanentAccountNumber);
System.out.println("User Aadhaar Number is "+aadhaarNumber);
System.out.println("User Address is "+address);
System.out.println("User Bank Name"+bankName);



}


public static void main(String [] args){
	
	saveUserAccount( "LP5245PB",8217279387l,"sahadev nagar old hubli", "punjab national Bank");




}
}