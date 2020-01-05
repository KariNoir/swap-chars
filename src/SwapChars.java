
public class SwapChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String swap2(String str) {
		// TODO Auto-generated method stub

		int strLength = str.length();

		if (strLength < 2) {
			return str;
		}
		char lastCharacter = str.charAt(strLength - 1);
		char secondLastCharacter = str.charAt(strLength - 2);

		return "" + lastCharacter + secondLastCharacter; // putting "" tells computer to cancatinate the letters
	}

}
