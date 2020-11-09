package com.stest.login.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.stest.login.bean.Mentee;

public class LoginDAO {
	private static List<Mentee> mentees = new ArrayList<>();

	public static List<Mentee> getMenteesList() {

		// for (int i = 0; i < 10; i++) {
		mentees.add(new Mentee(12, "Ratan", "Voilet", "Suraksha Vihar, Badaun"));
		mentees.add(new Mentee(7, "Mata", "Purple", "Aligarh"));
		mentees.add(new Mentee(10, "Rani", "Orange", "Delhi"));
		mentees.add(new Mentee(11, "Kajal", "Omaxe Nile", "Kannauj"));
		// }
		
		mentees = mentees.stream().sorted(Comparator.comparing(Mentee::getId).thenComparing(Mentee::getName))
				.collect(Collectors.toList());
		return mentees;
	}
}
