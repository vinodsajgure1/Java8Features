package com.example.streamCompleteExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// 1. How Many Male and female Employees are there in the organization.

		Map<String, Long> maleAndFemales = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(maleAndFemales);

		System.out.println("************************************");

		// 2. Print the name of all departments in the organization.

		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		System.out.println("************************************");

		// 3. Average age of male and female employees.

		Map<String, Double> AverageAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(AverageAge);

		System.out.println("************************************");

		// 4. Get the details of Highest Paid Employee

		Optional<Employee> maxSalary = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		Employee highestSal = maxSalary.get();
		System.out.println("Id :" + highestSal.getId());
		System.out.println("Name :" + highestSal.getId());
		System.out.println("Age" + highestSal.getId());
		System.out.println("Gender :" + highestSal.getId());
		System.out.println("Department :" + highestSal.getId());
		System.out.println("Year Of Joining :" + highestSal.getDepartment());
		System.out.println("Salary :" + highestSal.getSalary());

		System.out.println("************************************");

		// 5. Get all the names of employees who have joined after 2015.

		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);

		System.out.println("************************************");

		// 6. Count the number of employees in each department.

		Map<String, Long> counts = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Set<Entry<String, Long>> entrySet = counts.entrySet();
		entrySet.forEach(System.out::println);

		System.out.println("************************************");

		// 7.What is the average salary of each department.

		Map<String, Double> avgSal = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		Set<Entry<String, Double>> entrySet2 = avgSal.entrySet();
		entrySet2.forEach(System.out::println);

		System.out.println("************************************");

		// 8. Get the Details of Youngest male Employee in product development
		// department.

		Optional<Employee> youngestEmp = employeeList.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(Employee::getAge));

		Employee employee = youngestEmp.get();
		System.out.println("Id : " + employee.getId());
		System.out.println("Name : " + employee.getName());
		System.out.println("Age : " + employee.getAge());
		System.out.println("Year of joining : " + employee.getYearOfJoining());
		System.out.println("salary : " + employee.getSalary());

		System.out.println("************************************");

		// 9. Who has the most working experience in the organization?

		Optional<Employee> findFirst = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining))
				.findFirst();

		Employee experienced = findFirst.get();
		System.out.println("Name " + experienced.getName());

		// 10. How many male and female employees are there in the sales and marketing
		// team?

		Map<String, Long> total = employeeList.stream().filter(e -> e.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(total);
		
		System.out.println("************************************");


		// 11. What is the average salary of male and female employees.

		Map<String, Double> avgSalary = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(avgSalary);
		
		
		
	}

}
