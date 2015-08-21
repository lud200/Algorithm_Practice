
public class firstrepeatingChar {
	public static void main(String[] args){
		String s1= "abcdb";
		int size = s1.length();
		String s = "";
		int count = 0;
		for(int i=0;i<size-1;i++){
			s=s+s1.charAt(i);
			
		}		
	}
}
