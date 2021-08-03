package com.company;
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class EmployeeMethod {
    public static void main(String[] args) {
        Employee one = new Employee();
        one.setName("Name_of_1");
        one.salary=300;
        System.out.println(one.getSalary());
        System.out.println(one.getName());
    }

}
