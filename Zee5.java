class Zee5{
	
public static void main (String[] args){
		
String kannadaMovieNames[] = {"Ranna","Hebbuli","Panchatantra","Shivaji Suratkal","Drushya","Garuda Gamana Vrishaba Vahana","Window Seat","Vikrant Rona","Ghost","Max","Pet Detective","Kona","Prachanda Ravana","Yaradu","Aaa Dinagalu","Huliraya","Udgarsha","Obba","Kendasampige","Ugramm"};
String englishMovieNames[] = {"The Northman","Uncharted","Firestarter","Infinite Storm","Montana Story","The Bad Guys","Sisu","Borderlands","Blue Moon","Gunslingers","Trust","Regretting You","Caught Stealing","Him","Bugonia","The Running Man","Spinal Tap II","A Big Bold Beautiful Journey","Five Nights at Freddy’s","Border Hunters"};
String hindiMovieNames[] = {"Safia","Sirf Ek Bandaa Kaafi Hai","Sam Bahadur","The Kashmir Files","Gadar 2","Khichdi 2: Mission Paanthukistan","Haddi","Sam Bahadur","Scammy Boys","Kadak Singh","The Last Coffee","Chhatriwali","Tantrakarma","36 Farmhouse","Kya Meri Sonam Gupta Bewafa Hai?","Helmet","Dial 100","Nail Polish","Pareeksha","Fatafat"};
String malayalamMovieNames[] = {"Lokah","Padakkalam","thudarum","Vaazha","Avihitham","Ronth","Ponman","Tourist Family","Guruvayoor Ambalanadayil","Abraham Ozler","Falimy","Premalu","A.R.M","Romancham","Heaven","Neymar","Manjummel Boys","Vikram","Joe","Lover"};
String teluguMovieNames[] = {"Julie","Date with Saie","Gurram Paapi Reddy","Prema Vimanam","Heads & Tales","Kishkindhapuri","Vikkatakavi - The Movie","The Great Pre-Wedding Show","Sumathi Valavu","NET","420 IPC","Bhagwat Chapter One - Raakshas","Anaconda","45","HAMLET","Saali Mohabbat","Twinless","Charchaughi","Bha. Bha. Ba","Maaman"};

	
System.out.println("The list of kannada Movies:");
for (String kannadamovie: kannadaMovieNames){
	System.out.println(kannadamovie);
}
		
System.out.println("The list of English Movies:");
for (String englishMovie : englishMovieNames) {
    System.out.println(englishMovie);
}

System.out.println("The list of Hindi Movies:");
for (String hindiMovie : hindiMovieNames) {
    System.out.println(hindiMovie);
}

System.out.println("The list of Malayalam Movies:");
for (String malayalamMovie : malayalamMovieNames) {
    System.out.println(malayalamMovie);
}

System.out.println("The list of Telugu Movies:");
for (String teluguMovie : teluguMovieNames) {
    System.out.println(teluguMovie);
}

	}
	
}