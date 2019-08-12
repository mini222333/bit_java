package day10;
class CellPhone {

	String model;//모델명
	String number;//전화번호 
	int chord;  //화음
    
	public CellPhone() {
		super();
	}
	public CellPhone(String model, String number, int chord) {
		super();
		this.model = model;
		this.number = number;
		this.chord = chord;
	}
	public void setNumber(String n){
		number = n;
	}
	public String getModel(){
 		return model;
	}
	public int getChord(){
		return chord;
	}
	public String getNumber(){
		return number;
	}
}

class D_caPhone extends CellPhone{

	String pixel; 
	public D_caPhone(String model,String num, int chord, String pixel){
		super(model,num,chord);
		//super.model = model;
		//super.number = num;
		//super.chord = chord;
		this.pixel = pixel;
	}
}


class MP3Phone extends CellPhone{

	int size; 
	public MP3Phone(String model,String num, int chord, int size){
		super(model,num,chord);
		//this.model = model;
		//number = num;
		//this.chord = chord;
		this.size = size;
	}

}

