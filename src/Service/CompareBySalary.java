package Service;

import Entite.Employe;

import java.util.Comparator;

public class CompareBySalary implements Comparator<Employe> {

    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getSalaire() > e1.getSalaire()?1:-1;
    }
}
