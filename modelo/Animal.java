package modelo;

public class Animal{
    //Atributos

    private int peso =0;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String hablar(){
        return "Los animales no hablan";
    }
}