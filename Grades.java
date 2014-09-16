import java.util.Scanner;

public class Grades{

     public static void main(String []args){
		Scanner userInput = new Scanner(System.in);

		// user instructions
        System.out.println("Input grades. Quit by inputting -1 \n");

		// variables
		int input = 0;
		int count = 0;
		int sum = 0;
		int max = 0;
		int min = 100;
		int[4] grades = {};
		
		while (input != -1) {
			
			
			input = userInput.next();
			if (input == -1) display(average, max, min);
			count++;
			sum += input;
		
			
			// calculate grades grades
			if (input > 59){
				if (input > 69){
					if (input > 79){
						if (input > 89){
							grades[0]++;
						}
						grades[1]++;
					}
					grades[2]++;
				}
				grades[3]++;
				
			}
			grades[4]++;
			
			average = calcAverage(input, count, sum);
			max = calcHighest(input, max);
			min = calcLowest(input, min);
			
			
			

		};

		
		
		
    }
	 
	 static int calcAverage(int input, int count, int sum,){
	 
		average = sum / count;
		
		return average;
	 }
	 
	 static int calcHighest(int input, int max){
		if (input > max) max = input;
		return max;
	 }
	 
	 static int calcLowest(int input, int min){
		if (input < min) min = input;

		return min;
	 }
	 
	display(int average, int max, int min, int grades[4]){
		// program output
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		for (int i = 0; i < 5; i++) {
			if (i == 0) letter = "A";
			if (i == 1) letter = "B";
			if (i == 2) letter = "C";
			if (i == 3) letter = "D";
			if (i == 4) letter = "F";
			
			System.out.println("Number of %d's : %d \n", i, grades[i]);
		}
	
	}	 
}
