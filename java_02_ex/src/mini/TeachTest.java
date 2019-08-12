package mini;

import java.util.Arrays;

public class TeachTest {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("대장금", 50, "여");
		Student[] student = { new Student("김상희", 25, "여"), new Student("강도희", 23, "여"), new Student("신도희", 23, "여"),
				new Student("윤도희", 26, "여"), new Student("수제자", 25, "여"), new Student("김도희", 26, "여"),
				new Student("안도희", 26, "여"), new Student("박도희", 26, "여"), new Student("성도희", 26, "여"),
				new Student("서도희", 26, "여") };
		teacher.student=student;
		teacher.studentBest();// 호출
		teacher.print();
	}

}
