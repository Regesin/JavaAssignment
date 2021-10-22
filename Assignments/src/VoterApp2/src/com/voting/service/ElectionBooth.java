package com.voting.service;

import com.voting.exceptions.*;

public class ElectionBooth {
	String localities[] = { "ABC Nagar", "XYZ Nagar", "RK Nagar" };

	// if age is less than 18 throw exception
	boolean checkAge(int age) throws UnderAgeException {
		return true;
	}

	// check if the locality matches with the array
	boolean checkLocality(String locality) throws LocalityNotFoundException {
		return true;
	}

	// check if id is within 1000 - 9000
	boolean checkVoterId(int vid) throws NoVoterIDException {
		return true;
	}

	public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
		// call all three methods
		// handle the exception
		// throw it to the voter
		try {
			if (age < 18) {
				throw new UnderAgeException("Not Eligable - Age is Below 18");
			}
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			for (int i = 0; i <= localities.length; i++) {
				if (localities[i] != locality) {
					throw new LocalityNotFoundException("This not your Booth - please check it onceagain");

				}
			}
		} catch (LocalityNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			if (vid > 1000 & vid < 9000) {
				throw new NoVoterIDException("Your Voter ID is Suspenced - Please contact authorities ");
			}
		} catch (NoVoterIDException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return true;
	}

}
