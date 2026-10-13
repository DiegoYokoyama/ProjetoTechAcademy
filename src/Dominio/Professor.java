package Dominio;

public class Professor extends AbsPessoa{
    private Double Salario;


    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public Double CalcularBonificacao(){
        return (this.Salario * 0.10);
    }

    

    
    @Override
    public void exibir() {
        
        System.out.println("----------------------");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome );
        System.out.println("CPF: " + this.cpf );
        System.out.println("Salario: " + this.Salario );
        System.out.println("Bonificação: " + this.CalcularBonificacao());
        
        
    }

    public Professor(){}

    public Professor(int codigo, String nome, String cpf, Double salario){
        super(codigo, nome, cpf);
        this.Salario = salario;

    }
}
