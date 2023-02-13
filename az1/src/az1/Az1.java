package az1;

public class Az1 {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
		int firstE = 0, lastE = arr.length;
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[firstE] == arr[lastE - 1] && firstE >= lastE) {
				System.out.print("yes");
			}
			firstE++;
			lastE--;
		}
		
	}

}
