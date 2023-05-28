/**
 * 
 */
package task;

/**
 * @author Kevin Liu
 *
 */
public class Q12_IntToRoman {

	/**
	 *
	 * 	For example, 2 is written as II in Roman numeral, just two one's added together.
	 * 	12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
	 *
	 *  Roman numerals are usually written largest to smallest from left to right.
	 * 	However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
	 * 	The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
	 *
	 * I can be placed before V (5) and X (10) to make 4 and 9.
	 * X can be placed before L (50) and C (100) to make 40 and 90.
	 * C can be placed before D (500) and M (1000) to make 400 and 900.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(intToRoman(1994));
	}
	
    public static String intToRoman(int num) {
    	
      /**
	   * Symbol       Value
	   * I             1
	   * V             5
	   * X             10
	   * L             50
	   * C             100
	   * D             500
	   * M             1000
       */
    	
    	String result = "";
    	
    	if (num > 0) {

    		while (num > 1000) {
    			num = num - 1000;
    			result = result + "M";
    		}
    		
    		if (num < 1000 && num >= 900) {
    			num = num - 900;
    			result = result + "CM";
    		}
    		
    		while (num > 500) {
    			num = num - 500;
    			result = result + "D";
    		}
    		
    		if (num < 500 && num >= 400) {
    			num = num - 400;
    			result = result + "CD";
    		}
    		
    		while (num > 100) {
    			num = num - 100;
    			result = result + "C";
    		}
    		
    		if (num < 100 && num >= 90) {
    			num = num - 90;
    			result = result + "XC";
    		}
    		
    		while (num > 50) {
    			num = num - 50;
    			result = result + "L";
    		}
    		
    		if (num < 50 && num >= 40) {
    			num = num - 40;
    			result = result + "XL";
    		}
    		
    		while (num > 10) {
    			num = num - 10;
    			result = result + "X";
    		}
    		
    		if (num < 10 && num >= 9) {
    			num = num - 40;
    			result = result + "IX";
    		}
    		
    		while (num >= 5) {
    			num = num - 5;
    			result = result + "V";
    		}
    		
    		if (num < 5 && num >= 4) {
    			num = num - 4;
    			result = result + "IV";
    		}
    		
    		while (num >= 1) {
    			num = num - 1;
    			result = result + "I";
    		}
    	}
    	
		return result;
        
    }

}