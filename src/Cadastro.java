
public class Cadastro {
    private String apelido;
    private String frase;
    private boolean salvo;
    private int vitorias;
    private boolean vivo;
    private boolean ganhou;

    public boolean isSalvo() {
        return salvo;
    }

    public void setSalvo(boolean salvo) {
        this.salvo = salvo;
    }
    public boolean getSalvo(){
        return this.salvo;
    }
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }


    public Cadastro(String apelido, int vitorias, boolean vivo, boolean ganhou) {
        this.apelido = apelido;
        this.vitorias = vitorias;
        this.vivo = vivo;
        this.ganhou = ganhou;
    }

    public Cadastro() {
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean isGanhou() {
        return ganhou;
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }
    
}
