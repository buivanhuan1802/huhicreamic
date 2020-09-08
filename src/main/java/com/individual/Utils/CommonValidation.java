package com.individual.Utils;

import org.springframework.stereotype.Component;

@Component
public class CommonValidation {

	public boolean isInteger(String number) {

		try {
			int k = Integer.parseInt(number);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public boolean isEmtyString(String s) {
		return s == null || s.equals("");
	}
}
