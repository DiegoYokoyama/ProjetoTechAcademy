import Dominio.Aluno;
import Dominio.Colaborador;
import Dominio.Professor;
import Dominio.ProfessorEfetivo;
import FakeDB.AlunoFakeDB;
import FakeDB.ColaboradorFakeDB;
import FakeDB.ProfessorEfetivoFakeDB;
import FakeDB.ProfessorFakeDB;

public class App {
    public static void main(String[] args) throws Exception {
        ColaboradorFakeDB fDb = new ColaboradorFakeDB();
        for (Colaborador item : fDb.getDados()){
            item.exibir();

        }
        fDb.getDados();

        AlunoFakeDB aDb = new AlunoFakeDB();
        for (Aluno item : aDb.getDados()) {
            item.exibir();
        }
        aDb.getDados();

        ProfessorFakeDB pDb = new ProfessorFakeDB();
        for (Professor item : pDb.getDados()) {
            item.exibir();
        }
        pDb.getDados();

        ProfessorEfetivoFakeDB peDb = new ProfessorEfetivoFakeDB();
        for (ProfessorEfetivo item : peDb.getDados()) {
            item.exibir();
        }
        peDb.getDados();
    }

    

}

