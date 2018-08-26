import entities.Address;
import entities.Employee;
import entities.Town;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("liveDemo");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // 1.Remove objects (detach and merge)

       /*
        List<Town> towns = em.createQuery("select t from Town as t where length(t.name) > 5").getResultList();

        for (Town town : towns){
            em.detach(town);
            town.setName(town.getName().toLowerCase());
            em.merge(town);
        }

        em.getTransaction().commit();
        em.close();

        */

       // 2.Contains Employee

        /*

        String [] first_second_name = reader.readLine().split(" ");
        String first_name = first_second_name[0];
        String second_name = first_second_name[1];

        List<Employee> employee = em.createQuery("select firstName,lastName from Employee where firstName = '" + first_name + "' and lastName = '" + second_name + "'").getResultList();

        if (!employee.isEmpty()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        em.getTransaction().commit();
        em.close();

        */

        // 3.Employees with salary over specific amount

        /*
        int salary = Integer.parseInt(reader.readLine());
        List<String> employees = getEmployeeNameWhoHaveOverSpecificSalary(salary,em);

        for (String employeeName : employees){
            System.out.println(employeeName);
        }

        em.getTransaction().commit();
        em.close();

        */

        //4.Employees from Department

        /*
        String departmentForTheTest = "Research and Development";
        List<Employee> employeesFromSpecificDepartment = getEmpolyeesFromSpecificDepartment(departmentForTheTest,em);

        for (Employee employee: employeesFromSpecificDepartment) {
            System.out.printf("%s %s from %s - %.2f%n",employee.getFirstName(),employee.getLastName(),employee.getDepartment().getName(),employee.getSalary());
        }

        em.getTransaction().commit();
        em.close();

        */

        //5.Addresses with Employee Count

        /*
        List<Address> orderAndLimitTenAddresses = getTenOrderedAddresses(em);

        for (Address address : orderAndLimitTenAddresses) {
            System.out.printf("%s , %s - %d empolyees%n",address.getText(),address.getTown().getName(),address.getEmployees().size());
        }

        em.getTransaction().commit();
        em.close();
        */

        //6.Increase salaries

        /*
        List<Employee> employees = null;
        try {
            employees = em.createQuery("select e from Employee e where e.department.name in (:departmentNames)", Employee.class)
                    .setParameter("departmentNames", Arrays.asList("Engineering", "Tool Design", "Marketing", "Information Services"))
                    .getResultList();

            for (Employee employee : employees) {
                System.out.printf("OLD VALUE: id = %s, salary = %s%n", employee.getId(), employee.getSalary());
                final BigDecimal salary = employee.getSalary();
                employee.setSalary(salary.add(salary.multiply(new BigDecimal(0.12)))); // TODO: rounding
                em.merge(employee);
                em.flush();
                System.out.printf("NEW VALUE: id = %s, salary = %s%n", employee.getId(), employee.getSalary());
                //
            }

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        */
    }

    private static List<Address> getTenOrderedAddresses(EntityManager em) {
        final List<Address> addresses = em.createQuery("from Address a order by a.employees.size desc ,a.town.id asc").setMaxResults(10).getResultList();

        return addresses;
    }

    private static List<Employee> getEmpolyeesFromSpecificDepartment(String department, EntityManager em) {
        final List<Employee> employees = em.createQuery("select e from Employee e where e.department.name = :department order by e.salary,e.id").setMaxResults(10).getResultList();

        return employees;
    }

    private static List<String> getEmployeeNameWhoHaveOverSpecificSalary(final int salary, final EntityManager em) {
        final List<String> employees = em.createQuery("select firstName from Employee where salary >" + salary).getResultList();

        return employees;
    }
}
