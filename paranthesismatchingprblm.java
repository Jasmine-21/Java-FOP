import java.util.*;
public class paranthesismatchingprblm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println(match(in.nextLine()));
	}
    public static boolean match(String parens) {
    int count=0;
    char[] chars=parens.toCharArray();
    
    
    for(char c:chars)
    {
    	if(count<0)
    		return false;
    	if(c=='(')
    	{
    		count++;
    	}
    	else if(c==')')
    	{
    		if(count>0)
    		count--;
    	
    	else
    	{
    		return false;
    	}
    	}
    }
    if(count==0)
    {
    	return true;
    }
    else
    	return false;
}
}
