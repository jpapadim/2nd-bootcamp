//Wednesday 26/04/2017 Exercise 03

import java.util.*;
import java.lang.*;

public class Ex_03 {


	public static void main(String [] args) {
		int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};

        //Read repetitions
		System.out.println("Repetitions ? : ");
		Scanner input = new Scanner(System.in);
		int rep = input.nextInt();

		swiftArray(array,rep);
	}

	public static void swiftArray(int[]array,int rep) {
		int[]trnArray= new int [19];

			//Swift rep times
			for (int i=0; i<rep; i++){
				int a= array[9];
				System.arraycopy(array, 0, array, 1, 9);
				array[0]=a;
				System.out.println(Arrays.toString(array));
			}

	}
}