package com.voting.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import com.voting.service.ElectionBooth;
import com.voting.exceptions.NotEligibleException;

public class Voter {

	public static void main(String[] args) throws IOException {

		int voterAge=0, voterId =0;
		String locality;
		ElectionBooth booth  = new ElectionBooth();
	      BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Age of the Voter :");
		voterAge = Integer.parseInt(reader.readLine());
		System.out.println("Enter the Locality of the Voter : ");
		locality = reader.readLine();
		System.out.println("Enter the  VoterId of Voter :");
		voterId = Integer.parseInt(reader.readLine());
		try {
			booth.checkEligibility(voterAge, locality, voterId);
		} catch (NotEligibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		


		
	}

}
