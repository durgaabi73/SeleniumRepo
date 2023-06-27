package week1day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num= 34343;
    int reversedNum =0;
    int originalNum= num;
    
    while(num!=0) {
    	int remainder= num%10;
    	reversedNum= reversedNum* 10+ remainder;
    	num/=10;
    }
    if(originalNum==reversedNum) {
    	System.out.println("palindrome number");
    }
    
    else {
    	System.out.println("not a palindrome number");
    }
    		
	}

}
