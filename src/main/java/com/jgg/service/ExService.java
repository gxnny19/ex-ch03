package com.jgg.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class ExService {

	// 로그 객체 생성
	private static final Log log = LogFactory.getLog(ExService.class);

	// ex321
	public String ex321() {
		int number = 1;
		String result = "";

		if (number == 1) {
			result = "if 블록입니다.";
		} else if (number == 2) {
			result = "else if 블록입니다.";
		} else {
			result = "else 블록입니다.";
		}

		log.info(result);
		return result;
	}

	// ex322
	public String ex322() {
		int[] array = { 1, 2, 3, 4, 5 };
		String result = "";

		for (int i = 0; i < array.length; i++) {
			result += "(i = " + array[i] + ") ";
		}

		log.info(result);
		return result;
	}

	// ex323
	public String ex323() {
		int[] array = { 1, 2, 3, 4, 5 };
		int i = 0;
		String result = "";

		while (i < array.length) {
			result += "i = " + array[i] + "<br>";
			i++;
		}

		log.info(result);
		return result;
	}

	public interface Car {
		public String getColor();
	}

	public class Sonata implements Car {
		public Sonata() {
			log.info("== 출고 == Sonata");
		}

		@Override
		public String getColor() {
			return " === 색상: RED === Sonata";
		}
	}

	public class K5 implements Car {
		public K5() {
			log.info(" == 출고 == K5");
		}

		@Override
		public String getColor() {
			return " === 색상: Yellow === k5";
		}
	}

	// ex324
	public String ex324() {
		Car car1 = new Sonata();
		String re1 = car1.getColor();
		Car car2 = new K5();
		String re2 = car2.getColor();

		String result = re1 + "<br>" + re2 + "<br>" + "차 두대를 출고하였음";
		return result;
	}

	public String ex325() {
		List list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);

		log.info("리스트의 두 번째 값: " + list.get(1));
		return list.get(1).toString();
	}

	public String ex326() {
		List list = new ArrayList<String>();

		list.add("public");
		list.add("static");
		list.add("void");

		for (int i = 0; i < list.size(); i++) {
			log.info("i번째 요소 출력: " + list.get(i));
		}

		list.remove(1);
		int voidIndex = list.indexOf("void");
		log.info("void의 index = " + voidIndex);

		return "리스트 최종 상태: " + list.toString();

	}

	public boolean ex327() {

		String str1 = new String("is same?");
		String str2 = new String("is same?");

		log.info(str1 == str2); // true or false?
		return str1 == str2;
	}

	public boolean ex328() {
		String str1 = new String("is same?");
		String str2 = new String("is same?");

		log.info(str1.equals(str2)); // true or false?
		return str1.equals(str2);
	}

//		람다 표현식
	public boolean ex331() {
		List list = new ArrayList<String>();

		list.add("public");
		list.add("static");
		list.add("void");

		list.sort(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareTo(str2);
			}
		});
		list.sort((Comparator<String>) (str1, str2) -> str1.compareTo(str2));

		System.out.println(list);

		return true;
	}

//		스트림 API
	public boolean ex332() {
		List list = new ArrayList<String>();

		list.add("public");
		list.add("static");
		list.add("void");
		
		list.stream().forEach(str -> System.out.println(str));
		return true;
	}

}
