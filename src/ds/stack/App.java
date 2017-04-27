package ds.stack;

public class App {
	public static void main(String args[]){
		//Stack theStack = new Stack(10);
		/*theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);*/
		
	/*	while (! theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}
		*/
		System.out.println(reverseString("hello"));
	}
	
	public static String reverseString(String str){
		Stack charStack = new Stack(str.length());
		for (int i = 0; i < charStack.getMaxSize(); i++) {
			charStack.push(str.charAt(i));
		}
		
		Stack strStack = new Stack(charStack.getMaxSize());
		for (int j = 0; j < charStack.getMaxSize(); j++) {
			strStack.push(charStack.pop());
		}
		
		String result = "";
		for (int s = 0; s < charStack.getMaxSize(); s++) {
			result += strStack.getStackArray()[s];
		}
		 
		return result;
	}
	
}
