package day15;

public class Test04 {
public static void main (String[] args) {
	Command cmd = new DeleteCommand();
    cmd.exec();//다형성 new 뒤에 업데이트 가능
    //implements Command   바인딩 가능하게해줌
     cmd = new UpdateCommand();
     cmd.exec();
      
    
    
}
	
}
