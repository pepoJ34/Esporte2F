public class Esportista extends Pessoa{

    private int idFederacao;

    //Construtores
    public Esportista(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportista() {
    }

    //método
    public String sacar(){
        return this.getNome() + " Saque viagem...";
    }
}
