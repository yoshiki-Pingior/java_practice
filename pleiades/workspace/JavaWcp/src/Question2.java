
public class Question2 {
	public static void main(String[] args) {
		int i  = 0;
	    int loopCount = 100;
	    int numFizz = 3;
	    int numBuzz = 5;
	    String strFizz = "Fizz";
	    String strBuzz = "Buzz";
	    
	    for(i = 1; i <= loopCount; i++) {
	    	if(i % (numBuzz * numFizz) == 0) {
	    		System.out.println(strFizz + strBuzz);
	    	}else if(i % numFizz == 0) {
	    		System.out.println(strFizz);
	    	}else if(i % numBuzz == 0) {
	    		System.out.println(strBuzz);
	    	} else {
	    		System.out.println(i);
	    	}
	    }
	}

}

//回答一覧

//問1 for
//問2 if
//問3 else if
//問4 i % numBuzz == 0
