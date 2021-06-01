package ex01;

public class Ex02 {
	
	public static void quadrado(int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print("+");
				} else {
					System.out.print("x");
				}
			}
			System.out.print("\n");
		}
		
	}
	
	public static void main(String arg[]) {
	
		int n = 7;
		
		quadrado(n);
	
	}

}

/*

n = 4

+xxx
x+xx
xx+x
xxx+ 

*/