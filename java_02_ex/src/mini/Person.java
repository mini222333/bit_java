package mini;


public class Person {
	
		private String name;
		private int age;
		private String sex;
		
		Person(){
		}
		
		Person(String name, int age, String sex){
			this.name = name;
			this.age = age;
			this.sex = sex;
		}
		public void setName(String name) {
			this.name = name; //this.name=5.String name / =name =11.String name 
		}
		public String getName() {
		return name;
		
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public int getAge() {
			return age;
			
		}
		
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getSex() {
			return sex;
		}
		
		public void print() {
			System.out.println("이름:" + name);
			System.out.println("나이:" + age);
			System.out.println("성별:" + sex);
		}
		
		public void grow() {
			age++;
			System.out.println("나이" + age +"가 되었음");
		}
		
		
}
	


