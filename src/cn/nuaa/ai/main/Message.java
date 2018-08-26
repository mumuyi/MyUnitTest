package cn.nuaa.ai.main;

import java.util.Random;

public class Message {
	private static String[] header = { "AABBCCDD", "ABBCCDD", "AABBCCD", "AABBCCDDD", "AABBBCCDD", "AABB1123CCDD" };
	private static String[] ender = { "XXX", "XX", "XXXX", "XXX123", "XXXasdsada" };

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(createMessage());
		}
	}
	//生成报文;
	private static String createMessage() {
		StringBuffer ms = new StringBuffer();
		//随机生成头部;
		double temp = Math.random();
		if (temp < 0.16) {
			ms.append(header[0]);
		} else if (temp < 0.32) {
			ms.append(header[1]);
		} else if (temp < 0.48) {
			ms.append(header[2]);
		} else if (temp < 0.64) {
			ms.append(header[3]);
		} else if (temp < 0.80) {
			ms.append(header[4]);
		} else {
			ms.append(header[5]);
		}
		//随机生成报文内容;
		int timer = ((int) (Math.random() * 10));
		for (int i = 0; i < timer; i++) {
			temp = Math.random();
			if (temp < 0.9) {
				ms.append("{");
			}

			ms.append(getRandomString(((int) (Math.random() * 10))));

			temp = Math.random();
			if (temp < 0.9) {
				ms.append("}");
			}
		}
		//随机生成报文结束标志;
		temp = Math.random();
		if (temp < 0.2) {
			ms.append(ender[0]);
		} else if (temp < 0.4) {
			ms.append(ender[1]);
		} else if (temp < 0.6) {
			ms.append(ender[2]);
		} else if (temp < 0.8) {
			ms.append(ender[3]);
		} else {
			ms.append(ender[4]);
		}
		return ms.toString();
	}

	public static String getRandomString(int length) {
		String str = "zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; ++i) {
			int number = random.nextInt(62);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}
}
