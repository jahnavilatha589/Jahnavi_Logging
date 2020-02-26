package com.epam.cleanCode;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class CalculateInterest 
{
   static Logger logger = Logger.getLogger(CalculateInterest.class);
	public static void main( String[] args ) throws IOException
    {
		logger.debug("This is DEBUG STATEMENT");
		logger.info("This is INFO STATEMENT");
		logger.warn("This is WARN STATEMENT");
		logger.error("This is ERROR STATEMENT");
		logger.fatal("This is FATAL STATEMENT");
    	Scanner sc = new Scanner(System.in);
    	logger.info("Choose either option 1 or 2 :"+"\n");
    	logger.info("1.Simple Interest"+"\n");
    	logger.info("2.Compound Interest"+"\n");
    	SimpleInterest simpleInterest = new SimpleInterest();
    	CompoundInterest compoundInterest = new CompoundInterest();
    	int choice = sc.nextInt();
    	switch(choice){
    		case 1:simpleInterest.readValues();
    			   simpleInterest.calculateSimpleInterest();
    			   simpleInterest.displayAmount();
    			   break;
    		case 2:compoundInterest.readValues();
			       compoundInterest.calculateCompoundInterest();
			       compoundInterest.displayAmount();
			   break;
			default:logger.info("Please Enter Valid Option!");
    	}
}
}
