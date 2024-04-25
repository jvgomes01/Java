package animal;

public class Cachorro extends Animal {
    String nome;

    public String getRaca() {
        return nome;
    }

    public void setRaca(String nome) {
        this.nome = nome;
    }
}
