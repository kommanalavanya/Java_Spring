package com.springs2.SpringsAnnotation;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("world best CPU");

	}

}
