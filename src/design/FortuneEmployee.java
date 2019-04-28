package design;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo firstEmployee = new EmployeeInfo("Tom Hanks", 101, "Accounting");
		EmployeeInfo secondEmployee = new EmployeeInfo("Jerry Jones",102,  "Clerk");


//		Map<Integer, List<Integer>> compensationMap = new HashMap<>(); //id, {salary, bonus, pension}
		List<Integer> salaryList = new ArrayList<>(3); //salary
		//       List<Integer> bonusList = new ArrayList<>(3);  //bonus

		//salary
		firstEmployee.setMonthlySalary(8000);
		secondEmployee.setMonthlySalary(6000);

		salaryList.add(firstEmployee.calculateSalary(8000));
		salaryList.add(secondEmployee.calculateSalary(6000));

		//numberOfYearsWithCompany
		ArrayList<Integer> numberOfYearsWithCompany = new ArrayList<>();
        numberOfYearsWithCompany.add(5);
        numberOfYearsWithCompany.add(1);



		//bonus
		ArrayList<Integer> bonusList = new ArrayList<>();
		bonusList.add(firstEmployee.calculateEmployeeBonus(numberOfYearsWithCompany.get(0)));
		bonusList.add(secondEmployee.calculateEmployeeBonus(numberOfYearsWithCompany.get(1)));
        System.out.println(bonusList.get(0));  // test

		//benefitLayout


		System.out.println("Your total annual salary is :::" + firstEmployee.calculateSalary(8000));
		System.out.println("Your total annual bonus is :::" + firstEmployee.calculateEmployeeBonus(1));
		System.out.println("Your pension will be :::" + firstEmployee.calculateEmployeePension());
/*
		//Add data to DB
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		connectToSqlDB.insertDataFromIntArrayListToMySql(salaryList, "tbl_salary", "salary");
		connectToSqlDB.insertDataFromIntArrayListToMySql(bonusList, "tbl_bonus", "bonus");

		//read from the database
		System.out.println("The current salary list ::::");
		System.out.println(connectToSqlDB.readDataBase("tbl_salary", "salary"));
		System.out.println("The current bonus list ::::");
		System.out.println(connectToSqlDB.readDataBase("tbl_bonus", "bonus"));


		 */


	}

}
