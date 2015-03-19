import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.joestelmach.natty.DateGroup;
import com.joestelmach.natty.Parser;





public class bklah {
	public static void main(String [] args){
		Parser parser = new Parser();
		List<DateGroup> groups = parser.parse("do by 2015/15/12");
		//List<DateGroup> groups = parser.parse("do by 4 days");
		for(DateGroup group: groups){
			  List dates = group.getDates();
//			  int line = group.getLine();
//			  int column = group.getPosition();
//			  String matchingValue = group.getText();
//			  String syntaxTree = group.getSyntaxTree().toStringTree();
//			  String[] temp=dates.toString().split(" ");
//			  System.out.println(dates.toString());
//			  String a=temp[2]+"/"+temp[1]+"/"+temp[5].replace("]", "");
//			System.out.println(temp[2]+"/"+temp[1]+"/"+temp[5].replace("]", ""));
			SimpleDateFormat actual = new SimpleDateFormat("[EEE MMM dd HH:mm:ss z yyyy]");
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
			SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy");
			String newDate;
			System.out.println("Actual format "+dates.toString());
			try {
				newDate = sdf2.format(actual.parse(dates.toString()));
				System.out.println("done "+newDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 
		}
		
	}
	
	
}
