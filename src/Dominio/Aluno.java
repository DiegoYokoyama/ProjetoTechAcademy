package Dominio;

public class Aluno extends AbsPessoa{
    private String matricula;
    private Double nota;
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Double getNota() {
        return nota;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }

    
    @Override 
    public void exibir(){
        
        System.out.println("----------------------");
        System.out.println("[Aluno] Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("nota: " + this.nota);
    }

    public Aluno(){}

    public Aluno(int codigo, String nome, String cpf, String matricula){
        super(codigo, nome, cpf);
        this.matricula = matricula;
    }
    
}
