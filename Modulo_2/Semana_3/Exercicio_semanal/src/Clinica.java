import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nome;
    private String cnpj;
    private String logradouro;
    private String codigo;

    public Clinica(String nomeDono, Clientes clientes){

    }


    private List<Clientes> listaClientes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setListaClientes(Clientes clientes) {
        this.listaClientes.add(clientes);
    }

    public List<Clientes> getListaClientes() {
        return listaClientes;
    }
}
