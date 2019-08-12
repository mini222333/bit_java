package day17;

import java.io.IOException;

public class PriceException extends IOException{//익셉션이나 io익셉션 상속 런타임은 잘쓰지않음

	
	public PriceException() {
		super("PriceException : 음수 허용 안됨");
	}
	public PriceException(String msg) {
	super(msg);
	}//예외처리해주는 익셉션 상속 필수 예외를 다루는 사용자정의예외클래스

}
