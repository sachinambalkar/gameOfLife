package com.kata.gameOfLife.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UtilHelperImpl implements UtilHelper {
	
	public void Start(){
		Scanner sc=new Scanner(System.in);
		int totalRows,totalColumns;
		Map<Integer,Set<Integer>> dataMap=new HashMap<>();
		System.out.print("\nEnter number of rows: ");
		totalRows=sc.nextInt();
		System.out.print("\nEnter number of columns: ");
		totalColumns=sc.nextInt();
		insertDataIntoMap(dataMap);
	}
	
	private void insertDataIntoMap(Map<Integer,Set<Integer>> data){
		
		System.out.println("Keep inserting Row and Column position of live nodes.Enter -1 for exit.");
		Scanner sc=new Scanner(System.in);
		StringBuffer sb;
		boolean continueLoop=true;
		do{
			sb=new StringBuffer(sc.next());
			if(addIntoMap(sb.toString(),data)){
				System.out.println("Invalid Data");
			}else{
				System.out.println("Record added");
			}
		}while(continueLoop);
				
	}
	
	private boolean addIntoMap(String record,Map<Integer,Set<Integer>> data){
		
		String[] rowColumn=record.split(" ");
		if(rowColumn.length!=2){
			return false;
		}
	    int row=Integer.parseInt(rowColumn[0]);
	    int column=Integer.parseInt(rowColumn[1]);
		if(validateRowColumn(row,column)){
			
		}		
		return true;
	}
	
	private boolean validateRowColumn(int row,int column){		
		if(row<0 || column<0){
			return false;
		}
		return true;
	}
}
