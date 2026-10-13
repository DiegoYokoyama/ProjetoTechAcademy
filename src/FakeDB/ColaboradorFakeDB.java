package FakeDB;

import java.util.ArrayList;

import Dominio.Colaborador;

public class ColaboradorFakeDB {
    
    private ArrayList<Colaborador> dados;

    public ArrayList<Colaborador> getDados() {
        return this.dados;
    }

    public ColaboradorFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();

    }

    private void autoPreencher(){
        this.dados.add(new Colaborador(101,"Matheus Souza", "3291798", "Estagiario"));
        this.dados.add(new Colaborador(102,"Lucas Pontes", "8754653", "Estagiario"));
        this.dados.add(new Colaborador(103,"Fernando Carlos", "7789767", "Estagiario"));
        this.dados.add(new Colaborador(104,"Felipe Carvalho", "3456345", "Estagiario"));
        this.dados.add(new Colaborador(105,"Andre Matos", "6789898", "Estagiario"));
        

    }
    
}
