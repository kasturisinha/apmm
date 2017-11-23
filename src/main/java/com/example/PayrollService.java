package com.example;

import com.example.exception.InvalidSalaryException;

public class PayrollService {

	public double hrs(double salary) throws InvalidSalaryException {
		if (salary <= 0) {

			throw new InvalidSalaryException();

		}
		return salary * .60;

	}

	public double da(double salary) throws InvalidSalaryException {
		if (salary <= 0) {

			throw new InvalidSalaryException();

		}
		return salary * .10;

	}

}
