package day16;

public class Test02 {
	public static void main(String[] args) {
		System.out.println(" main start ");
		String msg = null;
		msg = "xmfsfl";
		try {
		System.out.println(msg.charAt(3));
		int num = Integer.parseInt(msg);//스트링을 인트타입으로컨버팅
		}catch (NullPointerException e) {
			System.out.println("예외발생 :"+e.getMessage());//null
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("예외발생 :"+e.getMessage());//index
		}catch (NumberFormatException e) {
			System.out.println("예외발생 :정수로 입력해주세요");//
		}catch (Exception e) {
			System.out.println("예외발생 :"+e.getMessage());//
			} finally {
				System.out.println("finally { 자원반납코드}");//자원반납코드 finally에서 필수
			}
	System.out.println(" main end ");
	}

}
