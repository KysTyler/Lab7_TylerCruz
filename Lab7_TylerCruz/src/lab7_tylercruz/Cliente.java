package lab7_tylercruz;

import java.util.ArrayList;

public class Cliente {
    ArrayList <Carro> listCarros = new ArrayList();
    private String name;
    private String apellido;
    private String edad;

    public Cliente() {
    }

    public Cliente(String name, String apellido, String edad) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }

    public ArrayList<Carro> getListCarros() {
        return listCarros;
    }

    public void setListCarros(ArrayList<Carro> listCarros) {
        this.listCarros = listCarros;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public void setCarro(Carro c) {
        this.listCarros.add(c);
    }

    @Override
    public String toString() {
        return "Cliente{" + "listCarros=" + listCarros + ", name=" + name + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    
}
