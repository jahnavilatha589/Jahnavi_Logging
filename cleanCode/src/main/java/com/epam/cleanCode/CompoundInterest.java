package com.epam.cleanCode;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class CompoundInterest {
	   static Logger logger = Logger.getLogger(CompoundInterest.class);
	float principleAmount,rate,time,compoundInterest,n;
	void readValues() throws IOException{
		Scanner sc = new Scanner(System.in);
		logger.info("Enter Principle Amount : ");
		principleAmount = sc.nextFloat();
		logger.info("Enter Rate : ");
		rate = sc.nextFloat();
		logger.info("Enter Time Period : ");
		time = sc.nextFloat();
	}
	void calculateCompoundInterest(){
		compoundInterest = (float) (principleAmount * (Math.pow((1 + rate / 100.0), time))); 
	}
	void displayAmount() throws IOException{
		logger.info("Total Amount : "+compoundInterest);
	}
	

}
