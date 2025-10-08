package entities;

public class Quarto {
    private int numero;
    private boolean ocupado;

    public Quarto(int numero){
        this.numero = numero;
        this.ocupado = false;
    }

    public boolean isOcupado(){
        return ocupado;
    }

    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }

    public int getNumero(){
        return numero;
    }

}
