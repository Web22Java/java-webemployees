package com.lambdaschool.webemployees;

import java.util.ArrayList;

public class EmpList {
    public ArrayList<Employee> empList = new ArrayList<Employee>();

    public EmpList() {
        empList.add(new Employee("Steve", "Green", 45000, true, 1, 1));
        empList.add(new Employee("Sam", "Ford", 80000, true, 1, 1));
        empList.add(new Employee("John", "Jones ", 75000, true, 1, 1));
    }

    public Employee findEmployee(CheckEmployee tester)
    {
        for (Employy e : empList)
        {
            if (tester.testie(e))
            {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Employee> findEmployees(CheckEmployee tester)
    {
        ArrayList<Employee> TempEmpList = new ArrayList<>();

        for (Employee : empList)
        {
            if (tester.test(e))
            {
                tempEmpList.add(e);
            }
        }
        return tempEmpList;
    }
}
