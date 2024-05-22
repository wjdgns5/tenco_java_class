package io.file.ch05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordFinder {

	public static void main(String[] args) {

		String fileName = "article.txt";
		// String fileName = "seoul.txt";
		// String fileName = "NewYork.txt";

		try (FileInputStream fis = new FileInputStream(fileName);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr)) {

			// 단어 빈도를 저장하기 위한 HashMap 생성
			Map<String, Integer> wordCountMap = new HashMap<>();
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+"); // 공백을 기준으로 분리

				// 분리된 단어들을 반복 처리
				for (String word : words) {
					System.out.println("word : " + word);

					// 빈 문자열이 아닌 경우에만 처리
					if (!word.isEmpty()) {
						// getOrDefault - 분리한 word 단어가 이미 map 구조에 존재한다면 현재 값을 가져오고
						// 없다면 0을 반환 합니다.
						// wordCountMap key - String
						// wordCountMap value = Integer
						wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
						// 단어가 처음이면 0 아니면 +1을 한다.
					} // end of if()
				} // end of for()
			} // end of while()

			String mostCommon = null;
			int maxCount = 0;

			for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
				if (entry.getValue() > maxCount) {
					mostCommon = entry.getKey();
					maxCount = entry.getValue();
				} // end of if()
			} // end of for()

			System.out.println("가장 많이 사용 된 단어 : " + mostCommon + " , " + maxCount + " 회");

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class
