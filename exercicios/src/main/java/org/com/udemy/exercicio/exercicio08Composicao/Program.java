package org.com.udemy.exercicio.exercicio08Composicao;

import org.com.udemy.exercicio.exercicio08Composicao.entities.Department;
import org.com.udemy.exercicio.exercicio08Composicao.entities.HourContract;
import org.com.udemy.exercicio.exercicio08Composicao.entities.Worker;
import org.com.udemy.exercicio.exercicio08Composicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new
                Worker(workerName, WorkerLevel.valueOf(workerLevel),
                baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        System.out.println("Counts for Contracts: " + worker.getContracts());
        worker.getContracts().forEach(hour -> {
            System.out.println("Contract " + hour.getDate());
            System.out.println("Hours " + hour.getHours());
            System.out.println("Total " + hour.totalValue());
        });

        sc.close();
    }

    }

