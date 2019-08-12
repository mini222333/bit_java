		package day19;
		
		import java.util.HashMap;
		import java.util.Map;
		import java.util.Scanner;
		
		public class Test03 {
			public static void main(String[] args) {	//해쉬맵 특정키값에 바인딩된 데이터를 꺼내주는 속도 매우 빠름
				Map<String, String> map = new HashMap<String, String>();
				//키값 밸류값 <object,object>모든데이터타입을다사용할수있다는뜻 다운캐스팅 불편하니 스트링
				//키값 중복불허 키값 넣고 밸류값 넣음 풋을 이용해서 집어넣음 꺼낼땐 겟
				map.put("java01", "1234");
				map.put("java02", "1234");
				map.put("admin", "admin");
				for(int i=0;i<30;i++) {
				map.put("test"+i, (int)(Math.random()*3)+"aa");
			}
				Scanner scanner = new Scanner(System.in);
				while(true) {
					System.out.println(" 로그인 처리 ");
					System.out.println("ID/PW 형식으로 입력해주세요");
					String data = scanner.nextLine();
					String[] idpw = data.split("/");
					String id = idpw[0];
					String pw = idpw[1];
					if(map.containsKey(id)) {
						if(map.get(id).equals(pw)) {
							System.out.println("로그인 성공");
							break;//성공하면 와일루프에서 빠져나옴
						}else {
							System.out.println("pw 불일치");
							System.out.println("다시 로그인하세요");
						}
					}else {
						System.out.println("id가 존재하지않습니다");
						System.out.println("회원가입후 이용하세요...");
				
					}
			}
				System.out.println("이제부터 서비스 이용이 가능합니다.");
			}
		}
		
		