package Model;

public class Livro {
    private Long codigo;
    private String nome;
    private String autor;
    private String datadeLancamento;


    public Livro() {
    }


    public Livro(Long codigo, String nome, String autor, String datadeLancamento) {
        this.nome = nome;
        this.autor = autor;
        this.datadeLancamento = datadeLancamento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDatadeLancamento() {
        return datadeLancamento;
    }

    public void setDatadeLancamento(String datadeLancamento) {
        this.datadeLancamento = datadeLancamento;
    }
}
