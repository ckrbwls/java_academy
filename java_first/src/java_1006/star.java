package java_1006;

public class star {

	public static void main(String[] args) {
		/*
		 *****
		 *****
		 *****
		 *****
		 *****
		 */
		/*
		for (int i=0; i<5; i=i+1) {
			for (int j=0; j<5; j=j+1) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		*/
		/*
		 **
		 ***
		 ****
		 ***** 
		 */
		/*
		for (int i=0; i<5; i=i+1) {
			for (int j=0; j<i+1; j=j+1) {
			System.out.print("*");
		}
		System.out.println();
		}
		*/
		
		/*
		 *****
		 ****
		 ***
		 **
		 * 
		 */
		/*
		for (int i=0; i<5; i=i+1) {
			for (int j=0; j<5-i; j=j+1) {
			System.out.print("*");
		}
		System.out.println();
		}
		*/
		
		/*
		 *********
		 *******
		 *****
		 ***
		 * 
		 */
		/*
		for (int i=0; i<5; i=i+1) {
			for (int j=0; j<9-2*i; j=j+1) {
			System.out.print("*");
		}
		System.out.println();
		}
		*/
		
		/*
		 *
		 **
		 ***
		 **
		 * 
		 */
		for (int i=0; i<5; i=i+1) {
			if (i<3) {
				for (int j=0; j<i+1; j=j+1) {
					System.out.print("*");
			}
			
		}
		else {
			for (int j=0; j<5-i; j=j+1) {
				System.out.print("*");
			}
			
		}
			System.out.println();
			
		}
		
		
		
		boolean flag = false;
		for (int i=0; i<1+10; i=i+1) {
			flag = !flag;
			System.out.println(flag);
		}
		
		
		
		
	}

}
