import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ifContains {
	
	private boolean match(String text){
        //Pattern pattern = Pattern.compile("(44|ʵ��ʧ��|ʵ�����ɹ�|��֤ʧ��|ʵ����֤ʧ��)");
	 	Pattern pattern = Pattern.compile("(�޻�·֧�ִ˽���)|45435defd");
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            System.out.println("ƥ�䵽�ˣ�"+matcher.group(1));
            return true;
        }
        System.out.println("û��ƥ�䵽");
        return false;
    }
	
public static void main(String[] args) {

	ifContains test = new ifContains();
    String text = "��1�н���ʧ�ܣ��޻�·֧�ִ˽���";
    System.out.println(test.match(text));
 
}
}
