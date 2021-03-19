
public class htmltags extends noiseremoval {
	public String removehtmltags_and_url(String s) {
    s = s.replaceAll("\\<.*?\\>", "");
    System.out.println("After removing HTML Tags: ");
    display(s);
    return s;

}
}