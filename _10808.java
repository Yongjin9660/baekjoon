import java.util.Scanner;

public class _10808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		int arr[] = new int[26];

		for (int i = 0; i < input.length(); i++) {
			arr[input.charAt(i) - 97]++;
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
