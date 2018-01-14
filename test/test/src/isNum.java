import java.util.regex.Pattern;


public class isNum {
	public static boolean isNumeric(String str){ 
		Pattern pattern = Pattern.compile("[0-9]*"); 
		return pattern.matcher(str).matches(); 
		} 
	
	public static void main(String[] args) {
		System.out.println(isNumeric("123"));
	}
}
