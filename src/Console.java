
import java.util.*;
public class Console {
	
	String [] MONTHS = {"Січень", "Лютий", "Березень", "Квітень", "Травень", "Червень", "Липень", "Серпень", "Вересень", "Жовтень", "Листопад", "Грудень"		};
	String [] Days = {"Понеділок", "Вівторок", "Середа", "Четверг", "П'ятниця", "Субота", "Неділя"};
	
	static void MyFirstText(){
		System.out.println("My first text");
	}
	 void GetDayMonth(){
		System.out.println(MONTHS[Calendar.MONTH]);
		System.out.println(Days[Calendar.DAY_OF_MONTH]);
	}

	void Strings0 (){
		int countRows = 5;
		for (int i = 0; i < countRows; i++) {
			System.out.println(getRowChars(i+1, '0'));
		}
	}
	
	 String getRowChars(int length, char ch ){
		if(length == 1){
			return(String.valueOf(ch));
		}else{
			return getRowChars(length - 1, ch )+ String.valueOf(ch);
		}
	}
	 
	 void rectangle(int rows, int cols, char ch){
		 String row = getRowChars(cols, ch);
		 for (int i = 0; i < rows; i++) {
			System.out.println(row);
		}
	 }
	 void showW(){
		 
		 System.out.println("*				*");
		 System.out.println("*		*		*");
		 System.out.println("*		*		*");
		 System.out.println("*		*		*");
		 System.out.println("	*		*	");
		 
		 
	 }
	
	
}
