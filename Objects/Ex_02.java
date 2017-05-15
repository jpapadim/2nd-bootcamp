//Wednesday 26/04/2017 Exercise 02

import java.util.Random;
public class Ex_02 /*or class Dice*/ {
	public static void main(String[] args) {

	rollMethod();
	}

		public static void rollMethod(){
			int i=0,j=0;
			int counter =0;
			do{
				i=(int)((Math.random()*6) +1);
				j=(int)((Math.random()*6) +1);
				counter++;
				System.out.println(i+ " ," +j);
			}while (i!=1 || j!=1);

			System.out.println("Times played until pair of ones: " + counter);

		}
	}
