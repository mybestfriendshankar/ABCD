package bhaskar;

public class primenumbers {

	public static void main(String[] args) {
int a=4,count=0;
for(int i=1;i<=5;i++) {
	if(a%i==0) {
		count++;
	}
}
	if(count==2) {
		System.out.println("this is prime number");
	}
	else {
		System.out.println("this is not prime number");
	}

	}

}
