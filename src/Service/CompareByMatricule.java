package Service;

import Entite.Employe;

import java.util.Comparator;

public class CompareByMatricule implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2) {
        return o1.getMatricule()> o2.getMatricule()?1:-1;
    }
}
