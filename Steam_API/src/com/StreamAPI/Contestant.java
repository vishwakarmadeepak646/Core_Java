package com.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;

public class Contestant {

	public String name;
	public String phone;

	public Contestant(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public static void main(String[] args) {

		Contestant c1 = new Contestant("Deepak", "9981237814");
		Contestant c2 = new Contestant("Kapil", "9981249816");
		Contestant c3 = new Contestant("Radha", "9981236713");
		Contestant c4 = new Contestant("Kapil", "99833321l2");
		Contestant c5 = new Contestant("Jayant", "111993406");
		Contestant c6 = new Contestant("Krishan", "111993406");
		Contestant c7 = new Contestant("Bahubali", "99569407l8");
		Contestant c8 = new Contestant("Ramesh", "9981993408");

		List<Contestant> li = new ArrayList<Contestant>();

		li.add(c1);
		li.add(c5);
		li.add(c4);
		li.add(c3);
		li.add(c2);
		li.add(c8);
		li.add(c6);
		li.add(c7);

		System.out.println("--------filter the phone number-------------------");

		li.stream().map(e -> e.phone).forEach(System.out::println);

		System.out.println("Filter remove the duplicate----------");

		li.stream().map(e -> e.phone).distinct().forEach(System.out::println);

		System.out.println("----------remove the invalid number------------------");

		li.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(System.out::println);

		//System.out.println("----------Getting three winner------------------");

		li.stream().distinct().map(e -> e.phone).filter(e -> e.length() == 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3);
				
				System.out.println("----------Getting three winner , Now print those Winner-----------------");

				li.stream().distinct().map(e -> e.phone).filter(e -> e.length() == 10)
						.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
							Collections.shuffle(e);
							return e.stream();
						})).limit(3).forEach(System.out::println);
	}
}
