public class Quiz12 {
  public static void main(String[] args) {
	  java.util.Scanner input=new java.util.Scanner(System.in);
	  System.out.println("Enter a String:");
	  String str=input.nextLine();
      reverseDisplay(str);
  }
  public static void reverseDisplay(String string) {
    reverseDisplay(string, string.length() - 1);
  }
  public static void reverseDisplay(String string, int i) {
	    if (i >= 0) {
	      
	      reverseDisplay(string, i - 1);
	    }
	  }
}