package day14;

public interface Command {
	public void exec();
	default public void check() {
		System.out.println("Command check() 함수");
		}//인터페이스 안에는 추상메소드이외에 디폴트메소드를 추가할수있다
	//이 디폴트 메소드는 abstract 메소드도 아니고 인스턴스 메소드도 아니다 마치 static처럼 내부적으로 분리가 됨


}
	
	class DeleteCommand implements Command{
		@Override
		public void exec() {
			System.out.println("Delete(삭제) 수행");
		}
		public void check() {
			System.out.println("DeleteCommand check() 함수");
	}
	}
	
	class InsertCommand implements Command{
		@Override
		public void exec() {
			System.out.println("Insert(등록) 수행");
		}
}
	class UpdateCommand implements Command{
		@Override
		public void exec() {
			System.out.println("Update(수정) 수행");
}
	
	}
	
	
	
	class ListCommand implements Command{
		@Override
		public void exec() {
			System.out.println("List(목록) 수행");
		}
	
	}

