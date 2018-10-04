package com.gmail.manjko;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>(Arrays.asList("Phil", "Anny",
				"Richard", "Chris", "Aaron"));
		System.out.println(longestName(name));

		System.out.println(namesWithStartLetter(name, 'A'));

		System.out.println(daysFromBirthDate("1979-08-08"));
	}

	public static String longestName(ArrayList<String> names) {
		if (names.size() == 0) {
			throw new IllegalArgumentException("Empty spase");
		}
		int a = 0;
		String longest = "";
		for (String i : names) {
			if (i.length() > a) {
				a = i.length();
				longest = i;
			}
		}
		return longest;
	}

	public static ArrayList<String> namesWithStartLetter(
			ArrayList<String> names, char startLetter) {
		ArrayList<String> alfabetNames = new ArrayList<>();
		for (String i : names) {
			if (i.charAt(0) == startLetter) {
				alfabetNames.add(i);
			}
		}
		return alfabetNames;
	}

	public static long daysFromBirthDate(String birthDateString) {
		LocalDate birthday = LocalDate.parse(birthDateString);
		LocalDate nowday = LocalDate.now();
		return ChronoUnit.DAYS.between(birthday, nowday);
	}
}
