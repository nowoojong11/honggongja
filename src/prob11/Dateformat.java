package prob11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {
	public static void main (String args[]) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(date));
		
	}
}
