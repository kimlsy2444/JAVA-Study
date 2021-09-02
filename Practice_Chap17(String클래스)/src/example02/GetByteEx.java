package example02;

import java.io.UnsupportedEncodingException;

public class GetByteEx {

	public static void main(String[] args) throws Exception {
	   String str = "안녕하세요";
	   
	   // 인코딩(기계가 알아보기 편하게 변환하는 과정)
	   
	   byte[] bytes1 = str.getBytes("EUC-KR");
	   System.out.println("bytes1(EUC-KR)의 길이 " + bytes1.length);
	   
	   byte[] bytes2 = str.getBytes("UTF-8");
	   System.out.println("bytes1(UTF-8)의 길이 " + bytes2.length);
	   
	   //디코딩(인간이 알아보기 쉽게 변환하는 과정)
	   String str1 = new String(bytes1,"EUC-KR");
	   System.out.println("EUC-KR로 디코딩한 문자열 : " +str1);
	   
	   String str2 = new String(bytes2,"UTF-8");
	   System.out.println("UTF-8로 디코딩한 문자열 : " +str2);
	}

}
