import java.util.*;
public class ArrayCopy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] source = {3, 4, 5};
		//a = source;
		int[] destination = new int[3];
		//b = destination;
		System.arraycopy(source, 0, destination, 0, 3); //(sourceArrayName, indexOfSource, destinationArrayName, indexOfDestination, length)
		
		System.out.println("Source Array:");
		for(int i = 0; i < 3; i++) {
			System.out.println(source[i]);
		}
		System.out.println("\nDestination Array:");
		for(int i = 0; i < 3; i++) {
			System.out.println(destination[i]);
		}
	}
}
		