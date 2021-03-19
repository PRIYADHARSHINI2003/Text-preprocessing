import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 class noiseremoval{

public String removestopwords(String Str){
    
String tempWord = Str; 
Str = Str.replaceAll(tempWord, ""); 

return Str;
}
public void removestopwords(String[] words) {
try {
       File f1=new File("C:\\Users\\Admin\\Documents\\KRITHIKA\\ASE AI\\OOpsem1\\stopwords.txt");
       StringBuilder Stopwords = new StringBuilder();      
       String s;
       String[] T=null;
       Scanner c = new Scanner(f1);
       while (c.hasNextLine()) {
         s=c.nextLine();
         Stopwords.append(s);
       }
         
       T = Stopwords.toString().split(" ");
         for(int i = 0; i < words.length; i++) {
        	 
             for(int j=0;j<T.length;j++) {
          	   
          	      if (words[i].equalsIgnoreCase(T[j])) {
          	    	  
          	        String str= removestopwords(words[i]);
               words[i]=str;
               
               break;
          	 }       
            }
             
  }
      
System.out.println("\n After removing stop words");       

}
catch (FileNotFoundException e){
    System.out.println("\n File does not exist");
   
}
}
public void display(String[] t) {
	System.out.println("After removing stopwords:\n");
	for(String i:t)
 		System.out.print(" "+i);
    
}
public void display(String s) {
	String ch="";
	Scanner b = new Scanner(s);
	while (b.hasNextLine()) {
		ch = ch.concat(b.nextLine()+"\n");
		
   }
		
	System.out.println(ch);
}
 }


public class Text extends noiseremoval{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text T = new Text();
		RemoveSpecialCharacter R=new RemoveSpecialCharacter();
		RemoveDuplicateWords obj = new RemoveDuplicateWords();
		htmltags h= new htmltags();
		UppercaseofSentence a = new UppercaseofSentence();
		
		
		String data="";
		String newstr="";
		  try{     File Fin= new File("C:\\Users\\Admin\\Documents\\KRITHIKA\\ASE AI\\OOpsem1\\Textdoc.txt");
		           Scanner Sc = new Scanner(Fin);
		        while (Sc.hasNextLine()) {
		        	 data = data.concat(Sc.nextLine()+"\n");
		    		
		        }
		        
	    	      
	    	      newstr=h.removehtmltags_and_url(data);
	    	     
	    	      newstr=R.removeSpecialCharacter_and_non_ASCII_characters(newstr);
	    	      newstr=obj.removeDuplicatewords(newstr);
	    	      
	    	      String [] text=newstr.split("\\s+");
		    	    T.removestopwords(text);
		    	    
		    	    
		    	    StringBuilder sb = new StringBuilder();
		    	      for(int i = 0; i < text.length; i++) {
		    	         sb.append(" "+text[i]);
		    	      }
		    	      String str = sb.toString();
		    	      
		    	      T.display(str);
		    	      
		    	newstr=a.Sentencetouppercase(str);   
		    	 
	    	  	
	    	  	
	    	  	
		  }
	    	      
		  catch (FileNotFoundException e){
			    System.out.println("\n File does not exist");
			   
			}
	}

}
