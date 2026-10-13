package FakeDB;

import java.util.ArrayList;

import Dominio.ProfessorEfetivo;

public class ProfessorEfetivoFakeDB {

    private ArrayList<ProfessorEfetivo> dados;

    public ArrayList<ProfessorEfetivo> getDados() {
        return this.dados;
    }

    public ProfessorEfetivoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }

    private void autoPreencher(){
        this.dados.add(new ProfessorEfetivo(301, "Fernanda", "4560001", 5200.0, 300.0));
        this.dados.add(new ProfessorEfetivo(302, "Geraldo", "4560002", 5600.0, 450.0));
        this.dados.add(new ProfessorEfetivo(303, "Helena", "4560003", 6100.0, 600.0));
        this.dados.add(new ProfessorEfetivo(304, "Igor", "4560004", 5900.0, 150.0));
        this.dados.add(new ProfessorEfetivo(305, "Juliana", "4560005", 6400.0, 750.0));
    }

}