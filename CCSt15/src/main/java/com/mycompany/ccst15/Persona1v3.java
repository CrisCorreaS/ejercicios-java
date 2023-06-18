//Cristina Correa Segade

package com.mycompany.ccst15;

import java.time.LocalDate;
import java.util.Objects;


public class Persona1v3 implements Comparable<Persona1v3>{

    protected String nombre;
    protected String telefono;
    protected String email;
    protected LocalDate fechaNacimiento;

    Persona1v3(String nombre, String telefono, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setfNacimiento(LocalDate nacimiento) {
        this.fechaNacimiento = nacimiento;
    }

    public LocalDate getfNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona1v3 other = (Persona1v3) obj;
        return nombre.equalsIgnoreCase(other.nombre);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre=" + nombre +
                ", telefono=" + telefono +
                ", email=" + email +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public int compareTo(Persona1v3 per) {
        return this.nombre.compareToIgnoreCase(per.nombre);
    }
}
