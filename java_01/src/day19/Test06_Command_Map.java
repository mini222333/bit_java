package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test06_Command_Map {
	//Map 구조로 설계
	public static void main(String[] args) {
		Map<String, Command> map = new HashMap<String, Command>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("delete update select insert중 하나 입력하세요");
		String cmd = scanner.nextLine();
		//객체 4개 맵구조가 관리
			map.put("insert", new InsertCommand());//insert.insertcommand레퍼런싱
			map.put("update", new UpdateCommand());
			map.put("select", new SelectCommand());
			map.put("delete", new DeleteCommand());
			map.put("new"   , new Command() {//new 입력하면 기능추가
				@Override
				public void exec() {
					System.out.println(" 기능 추가 ");
				}
			} );
			
		//String cmd = args[0]; //delete update select insert
			Command command = map.get(cmd);
			if(command != null) command.exec();//스위치를 이 두문장이 처리
			//map.get(cmd).exec();
}
}