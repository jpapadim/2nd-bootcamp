//Wednesday 26/04/2017 Exercise 01

    public class Ex_sgeorgiou_01 {
        public static void main(String[] args) {
     System.out.println(bootCamp(91,25));
 	}

     private static int bootCamp(int num1,int num2){

        	if (num1<num2) {
			double sum = Math.sqrt(Math.abs(num1 - num2));
			System.out.println ("Square root: ");
			return ((int)sum);
			}
			else {
				int sum = num1 + num2;
				System.out.println ("Sum: ");
				return (sum);
			}
	}
}