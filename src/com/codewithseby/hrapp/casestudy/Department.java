package com.codewithseby.hrapp.casestudy;

public class Department {

    private String name;
    private Employee[] employees = new Employee[10];

    private int lastAddedIndexEmployees = -1;

    public Department(String pName) {
        name = pName;
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Adaugam angajati in array
    public void addEmployees(Employee someEmployees) {
        // Arrayul lenght maxim in cazul nostru este pana la 10 , dar lastaddexindex poate fi de la 0 la 9 maxim.
        if (lastAddedIndexEmployees < employees.length) {        // if ( -1 < 0 )
            lastAddedIndexEmployees++;                           // -1 +1 = 0
            employees[lastAddedIndexEmployees] = someEmployees;  //  employees [0] = someEmployees ;
        }


    }

    public Employee[] getEmployees() {
        Employee[] actualEmployees = new Employee[lastAddedIndexEmployees + 1];
        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    public int getEmploycount() {
        return lastAddedIndexEmployees + 1;
    }


    public double getTotalSalary() {
        double totalSalary = 0;
        for (int i = 0;  i < lastAddedIndexEmployees; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    public double avgsalary() {
        double avgsalariu = 0;
        for (Employee angvaloare : employees) {
            avgsalariu = avgsalariu + angvaloare.getSalary();
        }
        return avgsalariu / employees.length;
    }
//Functie care cauta dupa id utilizator . O functie poate sa returneze si null ca sa putem folosi return intr-un if
    public Employee identificatoremployee(int pident) {

        for (Employee ididentif : employees) {
            if (pident == ididentif.getId()) {
                return ididentif;
            }
        }
        return null;

    }

}





