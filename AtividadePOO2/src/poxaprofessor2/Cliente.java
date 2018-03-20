package poxaprofessor2;

/**
 *
 * @author Clayton Garcia
 * Mat: 2016101697
 */
public class Cliente {
    private String Nome,CPF, Sexo;
    private int Idade;

    public String getNome() {
        String nomeFormatado = "";
        if(Nome.length() <8){
            nomeFormatado = String.format("%-10.10s", Nome);
        }else if(Nome.length()>=8 && Nome.length() <30){
            nomeFormatado = String.format("%-30.30s", Nome);
        }else if(Nome.length()>=30){
            nomeFormatado = String.format("%-42.42s", Nome);
        }
      return nomeFormatado;  
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return Idade;
    }
    
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
   
    
    public String infos(){
        String informacoes = String.format("%s%-5s%-12s%-12s",this.getNome(),this.getIdade(),this.getSexo(),this.getCPF());
        return informacoes;
    }
    
            
            
    
    
}
