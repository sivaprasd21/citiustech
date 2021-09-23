package citius_project;

public class IfCondition {

	public static void main(String[] args) {
		int age=80;
		if(age<25) {
			
			System.out.println("F");
		}else if(age<=45){
			
			System.out.println("E");
		}else if(age<=50){
			
			System.out.println("D");
		}else if(age<=60){
			
			System.out.println("C");
		}else if(age<=80){
			
			System.out.println("B");
		}else if(age>80){
			
			System.out.println("A");
		}

	}

}
