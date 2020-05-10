package com.citi.app.practice;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = { MyConverter2.class })
public interface MyConverter {

	@Mapping(source = "orderFinishDat", target = "orderFinishDate")
	@Mapping(source = "orderedProducts", target = "orderedProducts")
	@Mapping(source = "orderId", target = "orderId")
	Order fromSourceOrder(SourceOrder sourceOrder);

	@InheritInverseConfiguration
	SourceOrder fromOrder(Order order);

}
