public class Contains {
	public static void main (String[] args) {
	    int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
	 	int[] list2 = {1, 2, 1};
	 	contains(list1, list2);

    }
	public static void contains(int[] a1, int[] a2) {
		//Tells you is list one contains the second list
		   for(int i = 0; i <= a1.length - a2.length; i++) {
			   boolean c = true;
			   for(int j = 0; j < a2.length; j++) {
					if(a1[i + j] != a2[j]) {
						c = false;
						break;
					}
	       	   }		
	       	   	  if(c) {
				System.out.println("true");
			  } 
		   } 
	}
}
