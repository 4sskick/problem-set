import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class OrdinalDateParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = "21st Sept 1992";
		
		//expected:
		// 01/09/1992

		/*
		String[] dateSplit = date.split(" ");
		//date split [0]: 1st
		
		char[] temp = dateSplit[0].toCharArray();
		char[] temp1 = new char[2];
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("temp: "+Arrays.toString(temp));
		
		int j = temp1.length-1;
		for(int i = temp.length-1; i >= 0; i--) {
			
			if(i == temp.length - 1 || i == temp.length-2)
				continue;
			
			temp1[j] = temp[i];
			j--;
		}

		System.out.println("curr: "+Arrays.toString(temp1));
		
		for(int i=0; i < temp1.length; i++) {
			sb.append(temp1[i]);
		}
		
		sb.append(" ");
		sb.append(dateSplit[1]);

		sb.append(" ");
		sb.append(dateSplit[2]);
		
		System.out.println("final: "+sb);
		
		System.out.print(new SimpleDateFormat("d 'of' MMMM yyyy").format(date));

		 */

		date = date.replaceAll("(st|rd|th)", "");
//		System.out.println(new SimpleDateFormat("d MMMM yyy").format(date));
		System.out.println(LocalDate.parse(date, DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ENGLISH)));
//		System.out.println(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ENGLISH).parse(date));
	}

}
