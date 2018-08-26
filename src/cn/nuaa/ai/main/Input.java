package cn.nuaa.ai.main;

import java.util.Random;

public class Input {
	private static String[] header = { "AABBCCDD", "ABBCCDD", "AABBCCD", "AABBCCDDD", "AABBBCCDD", "AABB1123CCDD" };
	private static String[] ender = { "XXX", "XX", "XXXX", "XXX123", "XXXasdsada" };

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(createInput());
		}
	}

	// 生成工具输入;
	private static String createInput() {
		StringBuffer ms = new StringBuffer();
		double temp;
		// 随机生成输入内容;
		temp = Math.random();
		if (temp > 0.9) {
			ms.append(getRandomString(((int) (Math.random() * 10))));
		}
		ms.append(getRandomInt(((int) (Math.random() * 20))));
		temp = Math.random();
		if (temp > 0.9) {
			ms.append(getRandomString(((int) (Math.random() * 10))));
		}
		return ms.toString();
	}

	public static String getRandomInt(int length) {
		String str = "1234567890";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; ++i) {
			int number = random.nextInt(10);
			sb.append(str.charAt(number));
			double temp = Math.random();
			if (temp > 0.8) {
				sb.append(str.charAt(number));
			}
			if(temp > 0.95){
				sb.append(str.charAt(number));
			}
		}
		return sb.toString();
	}

	public static String getRandomString(int length) {
		String str = "zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM!@#$%";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; ++i) {
			int number = random.nextInt(57);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}
}
