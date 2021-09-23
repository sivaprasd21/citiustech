package citius_project;

public class Methodwithparameter {

	
	
		public String checkEligibility(int age) {
			if(age>=18) {
			return ("Eli");
			}else {
				return ("Ineli");
			}
			
		}
		public static void main(String[] args) {
			
			Methodwithparameter obj=new Methodwithparameter();
			String res = obj.checkEligibility(16);

			System.out.println(res);
			
		}

}
