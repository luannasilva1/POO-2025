public abstract class Cliente{
    private String nome;
    private String endereco;
    private InfoCliente infoCliente;

    public Cliente(String nome, String endereco, InfoCliente infoCliente) {
        setNome(nome);
        setEnderenco(endereco);
        setInfoCliente(infoCliente);

    }
    public String getNome(){
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setNome(String nome) { 
        this.nome = nome;
    }
    public void setEnderenco(String endereco) {
        this.endereco = endereco;
    }
    public InfoCliente getInfoCliente(){
        return infoCliente;
    }
    public void setInfoCliente(InfoCliente infoCliente){
        this.infoCliente = infoCliente;
    }

}