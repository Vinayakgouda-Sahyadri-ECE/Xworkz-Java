class MxPlayer{	
public static void main (String[] args){
		
String kannadaMovieNames[] = {"Shhh!", "Jatta", "Bettada Hoovu", "Nagamandala", "Mungaru Male", "Ulidavaru Kandanthe", "Kirik Party", "Lucia", "Bell Bottom", "INJECT 0.7", "Bhagyada Lakshmi Baramma", "Jolly Days", "Edegarike", "Chowka", "Charlie", "Krishna Talkies", "March 22", "Anagha", "Cinemadhavanu", "Ugramm"};
String englishMovieNames[] = {"Friends", "Tiger", "Rowdy", "Little Women", "Drive", "Mulan", "Sicario", "Don", "Youth", "Searching", "Once Upon a Time in Hollywood", "Salute", "Blackboard", "The Hunger Games: Catching Fire", "Stranded", "Ethan", "DEVINENI", "NCR Chapter One", "Vikram Vedha", "Blue Eyes"};
String hindiMovieNames[] = {"Pushpak","Jaane Bhi Do Yaaro","Queen","Section 375","Shubh Mangal Zyada Saavdhan","Ijaazat","Bholaa","Drishyam 2","Aashram","Bhaukaal","Campus Diaries","Roohaniyat","Hello Mini","Mumbai Saga","Sadak 2","Thappad","Article 15","Batla House","Ludo","Raid"};
String malayalamMovieNames[] = {"Bharatham","Vadakkunokkiyantram","Naadodikkaattu","Guru","Kaalapani","Pranchiyettan and the Saint","Vellam","Shubharathri","Margamkali","Kodathi Samaksham Balan Vakkeel","O.P.160/18 Kakshi Amminippilla","Sathyam Paranja Viswasikuvvo","Anjaam Pathiraa","Driving Licence","Joseph","Take Off","Android Kunjappan","Maheshinte Prathikaaram","Sudani from Nigeria","Kumbalangi Nights"};
String teluguMovieNames[] = {"Nuvvu Naaku Nachav","Prasthanam","Tholi Prema","Chi La Sow","Jambalakidi Pamba","Sagara Sangamam","Vijetha","Ammammagarillu","Chalo","Agent Sai Srinivasa Athreya","Pantham","Nela Ticket","MLA","Veera Bhoga Vasantha Rayalu","Abhimanyudu","Kiraak Party","Brochevarevarura","Eega","Raja Raja Chora","Pellichoopulu"};

				
System.out.println("The list of Kannada Movies:");
for(String kannadaMovie : kannadaMovieNames){
    System.out.println(kannadaMovie);
}

System.out.println("The list of English Movies:");
for(String englishMovie : englishMovieNames){
    System.out.println(englishMovie);
}

System.out.println("The list of Hindi Movies:");
for(String hindiMovie : hindiMovieNames){
    System.out.println(hindiMovie);
}

System.out.println("The list of Malayalam Movies:");
for(String malayalamMovie : malayalamMovieNames){
    System.out.println(malayalamMovie);
}

System.out.println("The list of Telugu Movies:");
for(String teluguMovie : teluguMovieNames){
    System.out.println(teluguMovie);
}
		
		
}
}