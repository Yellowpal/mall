package win.yellowpal.mall.util;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {
	
	public static String md5(String text){
		if(text == null){
			return null;
		}
		return DigestUtils.md5Hex(text);
	}
	
	public static void main(String[] args) {
		System.out.println(md5("123"));
	}
}
