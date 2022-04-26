package coreJava;

public class StringBuffer2 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer(" it is used to _ ");
		
		System.out.println(str.indexOf("_"));
		
		str.insert(15,"insert text");
		
		System.out.println(str);
		

	}

}
