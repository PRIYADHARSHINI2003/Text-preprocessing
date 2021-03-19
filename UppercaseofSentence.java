import java.util.Scanner;
public class UppercaseofSentence extends noiseremoval {
	public String Sentencetouppercase(String S) {
	String upper_case_line = "";	

    
    Scanner lineScan = new Scanner(S);
    while(lineScan.hasNextLine()) {
       String line = lineScan.nextLine();
       String[] lines=line.split("\\.");
       for(int i=0;i<lines.length;i++) {
    	   upper_case_line += Character.toUpperCase(lines[i].charAt(0)) + lines[i].substring(1) + ".";
       }
       
    }
       
    System.out.println("\n After changing the first character of sentence to uppercase: ");
    display(upper_case_line);
    return upper_case_line;

}
}


