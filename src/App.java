import Dominio.Colaborador;
import FakeDB.ColaboradorFakeDB;

public class App {
    public static void main(String[] args) throws Exception {
        ColaboradorFakeDB fDb = new ColaboradorFakeDB();
        for (Colaborador item : fDb.getDados()){
            item.exibir();

        }
        fDb.getDados();
    }

}

