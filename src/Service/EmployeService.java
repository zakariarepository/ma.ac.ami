package Service;

import Dao.EmployeDAO1;
import Dao.IemployeService;
import Entite.Employe;

import java.util.Comparator;
import java.util.List;

public class EmployeService {
    private IemployeService dao;

    private Comparator<Employe> EmployeComparator;

    public Comparator<Employe> getEmployeComparator() {
        return EmployeComparator;
    }

    public void setEmployeComparator(Comparator<Employe> employeComparator) {
        EmployeComparator = employeComparator;
    }

    public int sortEmploye(Employe e1,Employe e2){
        return EmployeComparator.compare(e1, e2);
    }

    public EmployeService(EmployeDAO1 d) {
        
        this.dao = d;
    }


    public void setDao(EmployeDAO1 d) {
        this.dao = d;
    }
    
    public int calculSalaire(Employe d){
        return d.getSalaire();
    };

    public void createmployeSer(Employe d){
        dao.createmploye(d);
    };





    public Employe chercherEmploye(int id){
        return dao.getById(id);
    }

    public List<Employe> showAll(){
        return this.dao.getAll();
    }

}
