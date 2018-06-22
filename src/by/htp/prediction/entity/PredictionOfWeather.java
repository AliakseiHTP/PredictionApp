package by.htp.prediction.entity;

import java.util.Map;
import java.util.Scanner;

public class PredictionOfWeather {
	private int iChoose = 0;
	private static int iCount = 0;
	Scanner in = new Scanner(System.in);
	
	public void menu(Map<Integer, String> map) {
		showMenu();
		do {
	        iChoose = in.nextInt();
	        switch (iChoose) {
	            case 1:
	            	randomeAnswer(map);
	                iCount++;
	                moreThanTenQuestions();
	                break;
	            case 2:
	            	randomeAnswer(map);
	            	iCount++;
	            	moreThanTenQuestions();
	                break;
	            case 3:
	            	randomeAnswer(map);
	            	iCount++;
	            	moreThanTenQuestions();
	                break;
	            case 4:
	            	randomeAnswer(map);
	            	iCount++;
	            	moreThanTenQuestions();
	                break;
	            case 5:
	            	randomeAnswer(map);
	            	iCount++;
	            	moreThanTenQuestions();
	                break;
	            case 6:
	            	randomeAnswer(map);
	            	iCount++;
	            	moreThanTenQuestions();
	            	break;
	            case 7:
	            	randomeAnswer(map);
	            	iCount++;
	            	moreThanTenQuestions();
	            	break;
	            case 8:
	            	System.out.println("Goodbye!");
					System.exit(0);
	            	break;
	            default:
	            	 System.out.println("Error! Please enter right variant!");
	                break;
	        	}
	    	} while (iCount <= 9);
	    }

		private void randomeAnswer(Map<Integer, String> map) {
			int random_number = 1 + (int) (Math.random() * map.size());
			System.out.println(map.get(random_number));
		}
	
		private static void moreThanTenQuestions() {
			if(iCount==10) {
				System.out.printf("\nSorry, there are enough questions for today. See you next month.");
			}
		}
		
		private static void showMenu() {
		    System.out.printf("%10s \n", "Prediction of weather");
		    System.out.println("1. On Monday");
		    System.out.println("2. On Tuesday");
		    System.out.println("3. On Wednesday");
		    System.out.println("4. On Thursday");
		    System.out.println("5. On Friday");
		    System.out.println("6. On Saturday");
		    System.out.println("7. On Sunday");
		    System.out.println("8. Exit");
		}
}
