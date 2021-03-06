package lab7_tylercruz;

import java.io.Serializable;

public class Carro implements Serializable{
    private String numeroPlaca;
    private String size;
    private String numeroDoors;
    private String clean;
    
    private static final long SerialVersionUID=101L;
    
    public Carro() {
    }

    public Carro(String numeroPlaca, String size, String numeroDoors, String clean) {
        this.numeroPlaca = numeroPlaca;
        this.size = size;
        this.numeroDoors = numeroDoors;
        this.clean = clean;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNumeroDoors() {
        return numeroDoors;
    }

    public void setNumeroDoors(String numeroDoors) {
        this.numeroDoors = numeroDoors;
    }

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }

    @Override
    public String toString() {
        return numeroPlaca + " " + size + ", clean=" + clean + '}';
    }
    
    
}
