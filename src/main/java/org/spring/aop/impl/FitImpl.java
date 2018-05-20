package org.spring.aop.impl;

import org.spring.aop.Fit;

public class FitImpl implements Fit{

	@Override
	public void filter() {
		System.out.println("FitImpl filter.");
	}

}
