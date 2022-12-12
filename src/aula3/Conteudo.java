package aula3;

public class Conteudo {

    private String titulo ;
    private String urlImagem;

    public Conteudo(String titulo, String urlImagem) {
        this.titulo = titulo;
        urlImagem = urlImagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl_Imagem() {
        return urlImagem;
    }

    public void setUrl_Imagem(String url_Imagem) {
        this.urlImagem = url_Imagem;
    }
}
