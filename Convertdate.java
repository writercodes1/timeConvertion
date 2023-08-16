import java.io.*; 
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
public class Convertdate{
public void convert(String input){

 
       
      DateFormat df = new SimpleDateFormat(" hh:mm:ss aa");
       
      DateFormat outputformat = new SimpleDateFormat(" HH:mm:ss");
      Date date = null;
      String output = null;
      try{
          
    	 date= df.parse(input);
          
    	 output = outputformat.format(date);
          
    	 System.out.println(output);
      }catch(ParseException pe){
         pe.printStackTrace();
       }

}

public static void main(String []args){
Convertdate aa = new Convertdate();
aa.convert(" 01:22:12 AM");

}

}