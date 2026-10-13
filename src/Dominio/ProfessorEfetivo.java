package Dominio;

public class ProfessorEfetivo extends Professor{

    private double trienio;

    public double getTrienio() {
        return trienio;
    }

    public void setTrienio(double trienio) {
        this.trienio = trienio;
    }

    @Override 
    
    public Double CalcularBonificacao(){
        return (this.getSalario() * 0.10) + this.trienio;

    }

     @Override
    public void exibir() {
        
        System.out.println("----------------------");
        System.out.println("[Professor Efetivo] Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome );
        System.out.println("CPF: " + this.cpf );
        System.out.println("Salario: " + this.getSalario() );
        System.out.println("trienio: " + this.trienio);
        System.out.println("Bonificação: " + this.CalcularBonificacao());
        
        
    }

    public ProfessorEfetivo(){}

    public ProfessorEfetivo(int codigo, String nome, String cpf, Double salario, Double trienio){
        super(codigo, nome, cpf, salario);
        this.trienio = trienio;
    }

    
}
