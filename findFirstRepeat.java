package chapter1;

import java.util.HashMap;

public class findFirstRepeat {
	
	public static String firstRepeat(String str){
		
		char[] myWord = str.toCharArray();
		
		HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
		
		int val = 0;
		
		for(char i: myWord){
			if(myMap.containsKey(i)){
				val = myMap.get(i);
				if(val>=1)
					return String.valueOf(i);
			}
			else{
				myMap.put(i, val+1);
			}
		}
		
		return "no repeat";
		
	}
	
	
	public static void main (String[] args){
		String word = "google";
		System.out.println(firstRepeat(word.toLowerCase()));
	}

}
