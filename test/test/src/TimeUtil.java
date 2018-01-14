import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TimeUtil {
	//����ǰ�ƻ����һ��/һ��/һ��
	public String addDate(String time){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		Date d;
		try {
			d=sdf.parse(time);
			Calendar begin=new GregorianCalendar();
			begin.setTime(d);
			//����1��
			//begin.add(Calendar.DATE, 1);
			//����1��
			//begin.add(Calendar.MONTH, 1);
			//ǰ��1��
			begin.add(Calendar.YEAR, -1);
			time=sdf.format(begin.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return time;
	}
	
	//���ڸ�ʽת��
	public String dateFormate(String time,String oldformat,String newformat){
		//oldformat��Ӧtime�ĸ�ʽ
		DateFormat format1 = new SimpleDateFormat(oldformat); 
		//newformatҪת���ĸ�ʽ
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
	//�����ƶ�
	//System.out.println(tu.addDate("20170831"));
	//���ڸ�ʽת��
	//System.out.println(tu.dateFormate("2017-08-31", "yyyy-MM-dd","yyyy��MM��dd�� HHʱmm��ss��"));
}
}
