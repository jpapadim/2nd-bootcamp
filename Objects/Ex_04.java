import java.util.Arrays;
import java.util.Scanner;

//Wednesday 26/04/2017 Exercise 04


public class Ex_04 {

	public static void main(String[] args) {
		int[] arrayInt = new int[]{1,2,3,4,5,6,7,8,9,10};

		Double[] arrayDouble =new Double[10];

		for(int i=0;i<10;i++){
		  arrayDouble[i]=(double)arrayInt[i];
		}//for

		System.out.println(Arrays.toString(arrayDouble));
		System.out.print("Times to shift the array? ");
		Scanner input = new Scanner(System.in);
		int rep = input.nextInt();
		input.close();
		   for(int j=0; j<rep; j++){
				int n = arrayInt[arrayInt.length -1];
				for (int k=arrayInt.length -2; k>=0; k--) {
				   arrayInt[k+1]=arrayInt[k];
				}
		arrayInt[0] = n ;
			}
		System.out.println("\n The array right-shifted "+rep+" times is:\n");
		System.out.println(Arrays.toString(arrayInt));
	}


}
