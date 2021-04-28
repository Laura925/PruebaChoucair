package com.choucairtesting.www.prueba.certificacion.models;

public class InformacionBusqueda {

    String keyword;
    String location;

    public InformacionBusqueda(String keyword, String location) {
        this.keyword = keyword;
        this.location = location;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }
}
