import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t1 {
	 
	 
	public static void main(String[] args) {
		/*Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyyMMdd");
		String time=format.format(date);
		System.out.println(time);*/
		
		
		/*Format f = new SimpleDateFormat("yyyy-MM-dd");     
        Date today = new Date();  
        System.out.println("������:" + f.format(today));  */
   
        
       /* String endTime= "2017-09-30";
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd" );
        try {
			Date date = sdf.parse( endTime);
			Calendar c = Calendar.getInstance();  
			c.setTime(date);  
			c.add(Calendar.DAY_OF_MONTH, 1);// ����+1��  
			Date tomorrow = c.getTime();  
			System.out.println("������:" + sdf.format(tomorrow));
		} catch (ParseException e) {
			e.printStackTrace();
		}
   */
		/*System.out.println(111);
		try{
		    Thread thread = Thread.currentThread();
		    thread.sleep(5*60*1000);//��ͣ5min��������ִ��
		}catch (InterruptedException e) {
		    e.printStackTrace();
		} 
		System.out.println(222);*/
		String a="1|11.00|2|3|4";
		String []s = a.split("\\|",-1);
		System.out.println(s[4]);
		/*s[1]=s[1].split("\\.")[0];
		System.out.println(s[1]);*/
	}
}
