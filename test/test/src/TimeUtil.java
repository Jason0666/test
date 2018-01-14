import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TimeUtil {
	//日期前移或后移一天/一月/一年
	public String addDate(String time){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		Date d;
		try {
			d=sdf.parse(time);
			Calendar begin=new GregorianCalendar();
			begin.setTime(d);
			//后移1天
			//begin.add(Calendar.DATE, 1);
			//后移1月
			//begin.add(Calendar.MONTH, 1);
			//前移1年
			begin.add(Calendar.YEAR, -1);
			time=sdf.format(begin.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return time;
	}
	
	//日期格式转换
	public String dateFormate(String time,String oldformat,String newformat){
		//oldformat对应time的格式
		DateFormat format1 = new SimpleDateFormat(oldformat); 
		//newformat要转换的格式
		DateFormat format2 = new SimpleDateFormat(newformat);         
		Date date = null;    
		try {    
		           date = format1.parse(time);   
		           time = format2.format(date);
		} catch (ParseException e) {    
		           e.printStackTrace();    
		}   
		return time;
	}
	
	
	 
public static void main(String[] args) {
/*	Calendar currDay = GregorianCalendar.getInstance();
	System.out.println(currDay.getTime());
	currDay.add(5, -1);
	System.out.println(currDay.getTime());*/
	TimeUtil tu=new TimeUtil();
	//日期移动
	//System.out.println(tu.addDate("20170831"));
	//日期格式转换
	//System.out.println(tu.dateFormate("2017-08-31", "yyyy-MM-dd","yyyy年MM月dd日 HH时mm分ss秒"));
}
}
