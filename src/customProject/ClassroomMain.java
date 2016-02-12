package customProject;

import java.util.HashMap;
import java.util.Scanner;

public class ClassroomMain {

	private static int count;
	static HashMap<Character, Boolean> light = new HashMap<Character, Boolean>();


	public static void main(String[]args){
		Scanner sO = new Scanner(System.in);
		light.put('1', false);
		light.put('2', false);
		light.put('3', false);
		
		char SelectorOption;
		while((SelectorOption = sO.next().charAt(0)) != 'Q'){
			switch(SelectorOption){
				case 'A':{
					System.out.println("Case A Please provide the number of students to be added to class");
					getStudentCount(true);
					break;
				}
				case 'R':{
					System.out.println("Case R Please provide the number of students to be removed from class");
					getStudentCount(false);
					break;
				}
				case 'L':{
					System.out.println("Case L Please provide the light value to be turned on");
					UpdateLightValue(true);
					break;
				}
				case 'O':{
					System.out.println("Case O Please provide the light value to be turned off");
					UpdateLightValue(false);
					break;
				}
				default: {
				System.out.println("Please provide the correct input");	
					break;
				}
			}
		}
	
	}
	
	private static void UpdateLightValue(boolean status) {
		Scanner Lig = new Scanner(System.in);
		char ch = Lig.next().charAt(0);
	        if(light.containsKey(ch)) {
	            light.put(ch,status);
	            for(char key : light.keySet()){
	            boolean value = light.get(key);
	            String value1 = (value)? "on":"off"; 
	            System.out.println("light at " + key + " is " + value1);	        
	            }
	        }
	}

	private static void getStudentCount(boolean test) {
		Scanner intval = new Scanner(System.in);
		int intvalue = intval.nextInt();
		count = (test)? (count + intvalue):(count - intvalue);
		count = (count > 0)? count:0;
		System.out.println("Total number of students in class room is "+count);
	}
}
