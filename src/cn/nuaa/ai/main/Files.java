package cn.nuaa.ai.main;

import java.util.Random;

public class Files {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(createFiles());
		}
	}

	// 生成文件;
	private static String createFiles() {
		StringBuffer ms = new StringBuffer();
		double temp;
		// 随机生成文件内容;
		int timer = ((int) (Math.random() * 10));
		for (int i = 0; i < timer; i++) {
			temp = Math.random();
			if (temp < 0.9) {
				ms.append("$");
			}

			ms.append(getRandomString(((int) (Math.random() * 10))));

			temp = Math.random();
			if (temp < 0.9) {
				ms.append("$");
			}
			
			ms.append("\n");
		}

		return ms.toString();
	}

	public static String getRandomString(int length) {
		String str = "zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890@";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; ++i) {
			int number = random.nextInt(63);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}
}
