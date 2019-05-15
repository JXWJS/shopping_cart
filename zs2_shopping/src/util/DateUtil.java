package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public String  createAccountCode(int userId){
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		
		String accountCode=sdf.format(new Date());
		if(userId < 10){
			accountCode=accountCode + "00" + String.valueOf(userId);
		}else if(userId < 100){
			accountCode=accountCode + "0" + String.valueOf(userId);
		}else {
			accountCode=accountCode  + String.valueOf(userId);
		}
		return accountCode;
		
	}
	
	public String nowDate(){
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String date=sdf.format(new Date());
		return date;
	}
	
	

}
