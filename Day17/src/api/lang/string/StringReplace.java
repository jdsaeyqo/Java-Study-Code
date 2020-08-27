package api.lang.string;

public class StringReplace {

	public static void main(String[] args) {

		/*
		 * replace(바꾸고 싶은 내용, 바꿀 내용) 바꾸고싶은 내용을 찾아 바꿀 내용으로 모두 바꿔줌.
		 */
		String str1 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다";
		String str2 = str1.replace("자바", "JAVA") ;
		System.out.println(str1);
		System.out.println(str2);
	}

}
