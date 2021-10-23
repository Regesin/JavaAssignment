package com.voting.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import com.voting.service.ElectionBooth;
import com.voting.exceptions.LocalityNotFoundException;
import com.voting.exceptions.NoVoterIDException;
import com.voting.exceptions.NotEligibleException;
import com.voting.exceptions.UnderAgeException;

public class Voter {

	public static void main(String[] args) throws IOException {

		int voterAge=0, voterId =0;
		String locality;
		ElectionBooth booth  = new ElectionBooth();
	    BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Age of the Voter :");
		voterAge = Integer.parseInt(reader.readLine());
		try {
			booth.checkAge(voterAge);
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
			System.exit(0);

		}
		System.out.println("Enter the Locality of the Voter : ");
		locality = reader.readLine();
		try {
			booth.checkLocality(locality);
		} catch (LocalityNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);

		}
		System.out.println("Enter the  VoterId of Voter :");
		voterId = Integer.parseInt(reader.readLine());
		try {
			booth.checkVoterId(voterId);
		} catch (NoVoterIDException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		try {
			booth.checkEligibility(voterAge, locality, voterId);
		} catch (NotEligibleException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}


		
	}

}
