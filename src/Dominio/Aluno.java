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
        System.out.println("Codigo: " + this.codigo);
        System.out.println("nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("matricula: " + this.matricula);
        System.out.println("nota: " + this.nota);
    }

    public Aluno(){}

    public Aluno(int codigo, String nome, String cpf, String matricula){
        super(codigo, nome, cpf);
        this.matricula = matricula;
    }
    
}
