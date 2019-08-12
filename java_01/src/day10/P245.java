package day10;
class P245 {

	public static void main(String[] args){
		D_caPhone d1 = new D_caPhone(
			"IN-7600","011-9XXX-9XXXX",60,"400만");
		MP3Phone mp = new MP3Phone(
			"KN-600","011-9XXX-9XXXX",60,256);
		
		System.out.println(d1.getModel()+","+
			d1.getChord()+","+d1.getNumber());
		
		
	}
}
