package Dao;

import Entite.Employe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeDAO1 implements IemployeService{
    Map<Integer, Employe> employees = new HashMap<>();
    @Override
    public List<Employe> getAll() {
        List<Employe> Listemployees = new ArrayList<>();
        for (int key: employees.keySet()) {
            Listemployees.add(employees.get(key));
        }
        return Listemployees;
    }

    @Override
    public Employe getById(int id) {
        return employees.get(id);
    }


    @Override
    public void createmploye(Employe employe) {
        employees.put(employe.getMatricule(),employe);

    }

    @Override
    public Employe uodatemploye() {
        return null;
    }

    @Override
    public void deletemploye() {

    }
}
