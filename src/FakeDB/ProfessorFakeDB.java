package FakeDB;

import java.util.ArrayList;

import Dominio.Professor;

public class ProfessorFakeDB {

    private ArrayList<Professor> dados;

    public ArrayList<Professor> getDados() {
        return this.dados;
    }

    public ProfessorFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }

    private void autoPreencher(){
        this.dados.add(new Professor(201, "Adão", "1230001", 3200.0));
        this.dados.add(new Professor(202, "Betina", "1240002", 3500.0));
        this.dados.add(new Professor(203, "Cláudia", "1250003", 3500.0));
        this.dados.add(new Professor(204, "Daniel", "1260004", 4100.0));
        this.dados.add(new Professor(205, "Eliane", "1270005", 3800.0));
    }

}