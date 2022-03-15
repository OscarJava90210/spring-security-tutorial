package Staff.Start;

import Staff.Service.ReportJSON;
import Staff.Service.WrapJAXB;
import Staff.ServiceRepo.Employees;
import Staff.ServiceRepo.Repository;

import java.io.File;
import java.util.concurrent.ThreadLocalRandom;

/*Точка входа в программу
 * @print Json
 * @author AAM
 * */
public class Starter {

    public static void main(String[] args) {
        Employees.setListOfEmployees(new File("C:\\Users\\task2\\Desktop\\employees.xml"), WrapJAXB.class);
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(10); i++) {
        }
        Repository.printReport();
        ReportJSON.convertReportToJSON(Repository.report);
    }
}