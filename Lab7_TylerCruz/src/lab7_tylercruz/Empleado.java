package lab7_tylercruz;

import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String apellido;
    private String edad;
    ArrayList <Carro> listCarros = new ArrayList();

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public ArrayList<Carro> getListCarros() {
        return listCarros;
    }

    public void setListCarros(ArrayList<Carro> listCarros) {
        this.listCarros = listCarros;
    }
    public void setCarro(Carro c) {
        this.listCarros.add(c);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", listCarros=" + listCarros + '}';
    }
    
    
    
}
