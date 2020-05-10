package com.citi.app.practice;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.factory.Mappers;

public class Main {
	private static MyConverter MAPPER = Mappers.getMapper(MyConverter.class);

	public static void main(String... args) {

		Order o = MAPPER.fromSourceOrder(getSourceOrder());

		System.out.println(o.getOrderFinishDate());
		o.getOrderedProducts().forEach((c) -> {
			System.out.println(c.getCode());
		});

	}

	public static SourceOrder getSourceOrder() {
		SourceOrder s = new SourceOrder();
		s.setOrderFinishDat("Today");
		s.setOrderId(1);
		SourceProduct s1 = new SourceProduct();
		s1.setCode("a1");
		SourceProduct s2 = new SourceProduct();
		s2.setCode("a2");
		List<SourceProduct> ls = new ArrayList<>();
		ls.add(s1);
		ls.add(s2);
		s.setOrderedProducts(ls);
		return s;
	}

}
