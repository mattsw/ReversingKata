

public class ReversingKata{
  private char[] reversing;
  public String reverseString(String toReverse){
	int cur,end;
	char temp;
    reversing = toReverse.toCharArray();
    for(int x = 0; x < reversing.length; x++){
    	cur = x;
    	end = reversing.length - 1;
    	for(; cur < end; cur++){
    		temp = reversing[cur];
    		reversing[cur] = reversing[end];
    		reversing[end] = temp;
    		end--;
    		
    	}
    }
    return new String(reversing);
  }


}
