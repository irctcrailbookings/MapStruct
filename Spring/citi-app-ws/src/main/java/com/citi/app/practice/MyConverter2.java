package com.citi.app.practice;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper
public interface MyConverter2 {
	
	Product fromSourceProduct(SourceProduct sourceProduct);
	
	@InheritInverseConfiguration
	SourceProduct fromProduct(Product product);
}
