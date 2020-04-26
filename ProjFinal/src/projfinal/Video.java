package projfinal;
public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private  int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //construtor

    public Video(String titulo, int avaliacao, int views, int curtidas, boolean reproduzindo) {
        this.titulo = titulo;
        this.avaliacao = avaliacao;
        this.views = views;
        this.curtidas = curtidas;
        this.reproduzindo = reproduzindo;
    }
    
    //getter e setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
    //outros métodos

    @Override
    public void play() {
        if(this.isReproduzindo()){
            System.out.println("Já está reproduzindo");
        }else{
            this.setReproduzindo(true);
            System.out.println("Agora o vídeo está reproduzindo");
        }
    }

    @Override
    public void pause() {
        if(this.isReproduzindo()){
            this.setReproduzindo(false);
            System.out.println("O vídeo foi pausado");
        }else{
            System.out.println("O vídeo já está pausado");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    //toString
    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
}
