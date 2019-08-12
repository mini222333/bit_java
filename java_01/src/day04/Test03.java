package day04;

public class Test03 {
	public static void main(String[] args) {
		
		AA:for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				if(j==5) break AA;
				//if(j==5) continue;
				System.out.printf("%d*%d=%2d | ",j,i,i*j);
			}
			System.out.println();
		}
	}

}
