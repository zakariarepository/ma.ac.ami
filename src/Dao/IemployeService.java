package Dao;
import Entite.Employe;
import java.util.List;

public interface IemployeService {
    public List<Employe> getAll();
    public Employe getById(int id);
    public void createmploye(Employe e);
    public Employe uodatemploye();
    public void deletemploye();

}
