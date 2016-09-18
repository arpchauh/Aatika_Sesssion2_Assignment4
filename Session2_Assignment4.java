package aatika;
import java.util.*;

public class Session2_Assignment4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year between 1 to 12");
		int y = sc.nextInt();
		if(y>0&&y<=12){	
			System.out.println(y);
		}else{
			
			System.out.println("Please enter the corrct value");
		}
		
		switch(y){
		case 1 : System.out.println("The month is January and the days are 31");
		break;
		case 2 : System.out.println("The month is February and the days are 28 and if it is a leap year then the days are 29");
		break;
		case 3 : System.out.println("The month is March and the days are 31");	
		break;
		case 4 : System.out.println("The month is April and the days are 30");	
		break;
		case 5 : System.out.println("The month is May and the days are 31");
		break;
		case 6 : System.out.println("The month is june and the days are 30");
		break;
		case 7 : System.out.println("The month is July and the days are 31");
		break;
		case 8 : System.out.println("The month is August and the days are 31");
		break;
		case 9 : System.out.println("The month is September and the days are 30");
		break;
		case 10 : System.out.println("The month is October and the days are 31");
		break;
		case 11 : System.out.println("The month is November and the days are 30");
		break;
		case 12 : System.out.println("The month is January and the days are 31");

		
		}
		
			

	}

}
