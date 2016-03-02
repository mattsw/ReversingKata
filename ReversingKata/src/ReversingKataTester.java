
public class ReversingKataTester {

  public static void main(String[] args){
	  String reversed;
	  ReversingKata reverse = new ReversingKata();
	  reversed = reverse.reverseString("12345");
	  System.out.println(reversed);
	  reversed = reverse.reverseString("54321");
	  System.out.println(reversed);
	  reversed = reverse.reverseString("1");
	  System.out.println(reversed);
	  reversed = reverse.reverseString("12");
	  System.out.println(reversed);
  }

}
