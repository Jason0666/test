import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ifContains {
	
	private boolean match(String text){
        //Pattern pattern = Pattern.compile("(44|实名失败|实名不成功|认证失败|实名认证失败)");
	 	Pattern pattern = Pattern.compile("(无汇路支持此交易)|45435defd");
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            System.out.println("匹配到了："+matcher.group(1));
            return true;
        }
        System.out.println("没有匹配到");
        return false;
    }
	
public static void main(String[] args) {

	ifContains test = new ifContains();
    String text = "第1行交易失败：无汇路支持此交易";
    System.out.println(test.match(text));
 
}
}
