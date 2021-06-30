public class Occurence {
	public static void main(String[] args){
		String str = "Hello every one";
		System.out.println(str);

		int count = 0;
	    for (int i=0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == 'e')
	        {
	             count++;
			System.out.println("số lần của e : " + count);
			System.out.println("index của e : " + i);
	        }
	    }
		
	}
}