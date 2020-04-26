package projfinal;
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int exp;
    //construtor

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.exp = 0;
    }
    
    //getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    //OUTROS MÉTODOS
    protected void ganharExp(){
        this.setExp(this.getExp() + 1);
    }

    //toString

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", exp=" + exp + '}';
    }
   
    
    
}
