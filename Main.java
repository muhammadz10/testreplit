class Main {
  public static void main(String[] args) {
    int x = 4 + 30 % 30 - 500 / 501; 		
	  int y = 10 + (int) 0.99; 			// evaluates to 10
	  for (int i = y - x; i > x; i--) { 		// i gets 6, 
		  if ((x % 2 == 1) != (y % 2 == 1)) {
			  System.out.print("bar");
			  i += 3;
		  } else {
			  System.out.print("foo");
			  x *= 1;
      }
    }
  }
}