package FakeDB;

import java.util.ArrayList;

import Dominio.Aluno;

public class AlunoFakeDB {

    private ArrayList<Aluno> dados;

    public ArrayList<Aluno> getDados() {
        return this.dados;
    }

    public AlunoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }

    private void autoPreencher(){
        Aluno a1 = new Aluno(10, "Alberto", "1234567", "ABC123");
        a1.setNota(8.5);
        this.dados.add(a1);

        Aluno a2 = new Aluno(11, "Breno", "3216549", "ABC124");
        a2.setNota(7.0);
        this.dados.add(a2);

        Aluno a3 = new Aluno(12, "Carlos", "3228765", "ABC125");
        a3.setNota(9.2);
        this.dados.add(a3);

        Aluno a4 = new Aluno(13, "Diego", "3234321", "ABC126");
        a4.setNota(6.8);
        this.dados.add(a4);

        Aluno a5 = new Aluno(14, "Evandro", "3249876", "ABC127");
        a5.setNota(10.0);
        this.dados.add(a5);
    }

}