### ```2주차```
---

* 실습
  * 2,4,5,6,8,9,10,12

##### ```10번```
~~~java
public class Q10 {
	public static void main(String[] args) {
		String s1 = "222222";
		String s2 = "2222222";

		String zero = "0";

		StringBuilder sb1 = new StringBuilder(s1); //s1
		StringBuilder sb2 = new StringBuilder(s2); //s2

		for (int i = 0; i < Math.abs(s1.length() - s2.length()); i++) {
			if (s1.length() - s2.length() < 0) {
				sb1.insert(0, zero);
				// s2에 s1만큼 0을 추가
			}
			if (s1.length() - s2.length() > 0) {
				sb2.insert(0, zero);
				// s1에 s2만큼 0을 추가
			}
		}

		// System.out.println(sb);
		// System.out.println(sb2);

		// int[] share = new int[sb.length()];
		int share = 0;

		StringBuilder sb3 = new StringBuilder("");

		for (int i = 1; i <= sb1.length(); i++) {

			int a = 0;
			int b = 0;

			char c1 = sb1.charAt(sb1.length() - i);
			char c2 = sb2.charAt(sb2.length() - i);

			if (i == 1) {
				share = 0;
				a = ((int) c1 - '0' + (int) c2 - '0') / 10;
				b = ((int) c1 - '0' + (int) c2 - '0') % 10;
			} else {
				a = ((int) c1 - '0' + (int) c2 - '0' + share) / 10;
				b = ((int) c1 - '0' + (int) c2 - '0' + share) % 10;

				share = 1;

			}

			share = a;

			sb3.insert(0, b);
		}

		if ((int) sb1.charAt(0) - '0' + (int) sb2.charAt(0) - '0' + share >= 10) {
			sb3.insert(0, 1);
		}

		System.out.println(sb3);
	}
}
~~~

##### ```2번```

...
