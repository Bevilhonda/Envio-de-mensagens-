public class Novo_Funcionario implements Enviar_Mensagens {
    private String nome ;
    private String cargo;
    private String email;

public Novo_Funcionario(String nome_funcionario , String cargo_funcionario , String email_funcionario){
    this.nome = nome_funcionario;
    this.cargo = cargo_funcionario;
    this.email = email_funcionario;

}

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public void Enviar_Email(Novo_Funcionario remetente , Novo_Funcionario destinatario) {
    String assunto = "" ;
    String mensagem = "" ;
    remetente.getEmail();
    destinatario.getEmail();

    }
    @Override
    public String Receber_email() {
        return null;
    }
}
