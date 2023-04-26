package Test;

import Dao.EmployeDAO1;
import Entite.Employe;
import Service.CompareBySalary;
import Service.EmployeService;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){

        EmployeService service=new EmployeService(new EmployeDAO1());
        List<Employe> employeList=new ArrayList<>();




        service.createmployeSer(new Employe("messaoudi", "amine","mail", 5679, 50000));
        service.createmployeSer(new Employe("farid", "ayoub","mail", 5876, 40000));
        service.createmployeSer(new Employe("sami", "ali","mail", 5318, 45000));
        service.createmployeSer(new Employe("rami", "salah","mail", 5200, 30000));

        service.chercherEmploye(23);

        employeList=service.showAll();

        System.out.println("--------------employees before sort----------------------");
        employeList.forEach(employe1 -> System.out.println(employe1.getName()+" "+employe1.getSalaire()));


        service.setEmployeComparator(new CompareBySalary());
        employeList.sort((Employe e1,Employe e2)->service.sortEmploye(e1,e2));



        System.out.println("--------------employees after sort----------------------");
        employeList.forEach(employe1 -> System.out.println(employe1.getName()+" "+employe1.getSalaire()));
    }
}
