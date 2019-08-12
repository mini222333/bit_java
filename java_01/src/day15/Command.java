package day15;

@FunctionalInterface //추상메소드 한개만 가능
public interface Command {
void exec();//강제성.꼭 오버라이딩
//인터페이스안에는 추상메소드만 들어간다
default public void check() {//강제성x 필요하면 오버라이딩
	System.out.println("check~~~~~~");
}//바디부 갖고싶으면 디폴트처리
	

}

class DeleteCommand implements Command{
	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");

	}
	
}

class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
	}
}