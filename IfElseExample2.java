public class IfElseExample2 {
	public static void main(String[] args) {
		int number =99;
		if(number>=50 && number<60){
			System.out.println("D");
		}else if(number>=60 && number<70){
			System.out.println("C");
		}else if(number>=70 && number<80){
			System.out.println("B");
		}else if(number>=80 && number<90){
			System.out.println("A");
		}else if(number>=90){
			System.out.println("A+");
		}else{
			System.out.println("F");
		}
	}

}
