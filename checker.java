public class checker {
	public static boolean isPerfectSquare(int number) {
		if(number <0){
			return false;
		}
		int sqrt  =(int) Math.sqrt(number);
		return sqrt * sqrt == number;
	}
	public static void main(String[] args){
		int number = 16;
	if (isPerfectSquare(number)){
		System.out.println(number  + " is a perfect Square ");
		}
	else{
		System.out.println(number  + " is not a perfect Square ");
		}
	}
}