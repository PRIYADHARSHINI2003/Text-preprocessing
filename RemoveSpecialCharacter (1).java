import java.util.*; 
public class RemoveSpecialCharacter extends noiseremoval{
	
	 public  String removeSpecialCharacter_and_non_ASCII_characters(String str)	
	 {
		 String resultStr=""; 
	//loop execute till the length of the string   
	for (int i=0;i<str.length();i++)  
	{  
	//comparing alphabets with their corresponding ASCII value  
	if ((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122 )||str.charAt(i)==32 ||str.charAt(i)==46|| (str.charAt(i)>=48 && str.charAt(i)<=57) ) //returns true if both conditions returns true  
	{  
	//adding characters into empty string   
	resultStr=resultStr+str.charAt(i);  
	}  
	}  
	System.out.println("String after removing special characters: "); 
	display(resultStr);
	
	
	return resultStr;
	}  
	



}


	
	


