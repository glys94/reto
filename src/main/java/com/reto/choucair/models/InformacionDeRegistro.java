package com.reto.choucair.models;

public class InformacionDeRegistro {
    private String nombre;
    private String apellido;
    private String contrasena;
    private String dia;
    private String mes;
    private String ano;
    private String compania;
    private String direccion;
    private String ciudad;
    private String estado;
    private String codigoPostal;
    private String pis;
    private String adicional;
    private String tefono;
    private String movil;
    private String correoReferencia;

    public InformacionDeRegistro(String nombre, String apellido, String contrasena, String dia, String mes, String ano, String compania, String direccion, String ciudad, String estado, String codigoPostal, String pis, String adicional, String tefono, String movil, String correoReferencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.compania = compania;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pis = pis;
        this.adicional = adicional;
        this.tefono = tefono;
        this.movil = movil;
        this.correoReferencia = correoReferencia;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public String getTefono() {
        return tefono;
    }

    public void setTefono(String tefono) {
        this.tefono = tefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getCorreoReferencia() {
        return correoReferencia;
    }

    public void setCorreoReferencia(String correoReferencia) {
        this.correoReferencia = correoReferencia;
    }

}
