public class StringCalculator {
   public static int add(final String numbers) throws Exception {
      int returnValue = 0;
      String[] numbersArray = numbers.split(",|\n"); 
      for (String number : numbersArray) {
         if (!number.trim().isEmpty()) {
        	int n = getValidNumber(number.trim());
            returnValue += n;
         }
      }
      return returnValue;
   }
   
   private static int getValidNumber(String numString) throws Exception {
	   int n = Integer.parseInt(numString.trim());
	   if (n < 0) {
		   throw new Exception("negatives not allowed");
	   }
	   else if (n >= 1000) {
		   return 0;
	   }
	   else {
		   return n;
	   }
   }
}