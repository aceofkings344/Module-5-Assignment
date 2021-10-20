import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter place to find number: ");
		int place = obj.nextInt();
		
		long startTime1 = System.nanoTime(); 
		int recursive = FibRecursive(place);
		long endTime1 = System.nanoTime();
		
		long startTime2 = System.nanoTime();
		int iterative = FibIterative(place);
		long endTime2 = System.nanoTime();
		
		long recursiveTime = endTime1 - startTime1;
		long iterativeTime = endTime2 - startTime2;
		
		System.out.println("Recursive number: " + recursive);
		System.out.println("Recursive time: " + recursiveTime);
		System.out.println("Iterative number: " + iterative);
		System.out.println("Iterative time: " + iterativeTime);

	}
	
	public static int FibRecursive(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		return FibRecursive(n - 1) + FibRecursive(n - 2);
	}
	
	public static int FibIterative(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int count = 0;
		
		while(count < (n - 1)) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			count++;
		}
		return n3;
	}

}
