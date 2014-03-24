package lab5.CI.stringparser;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringParser {
	
	// ['2014-03-10',25%]
	public String transformData(final Object[] data, final String pattern){
		Date date = (Date) data[0];
		int percentage =(Integer) data[1];
		StringBuilder resultLine = new StringBuilder("['");
		resultLine.append(new SimpleDateFormat(pattern).format(date));
		resultLine.append("',");
		resultLine.append(percentage);
		resultLine.append("%]");
		return resultLine.toString();		
	}
}
