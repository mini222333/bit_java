package day20;


import java.util.Iterator;
import java.util.Properties;
public class Test02 {
	public static void main(String[] args) {//키값중복x
		Properties p = new Properties();//환경설정파일핸들링할때씀 확장자.properties.스트링에서많이나옴
		p.setProperty("java01", "1214");
		p.setProperty("java02", "1244");
		p.setProperty("java03", "1234");
		p.setProperty("java07", "7234");
		p.setProperty("java09", "6234");
		System.out.println(p.getProperty("java01"));//키,밸류값 스트링 핸들링.자주쓰임
		
		Iterator it = p.keySet().iterator();
		while (it.hasNext()) {
				String key = (String)it.next();
				System.out.println(key + " : " +p.getProperty(key));

}
	}
}
