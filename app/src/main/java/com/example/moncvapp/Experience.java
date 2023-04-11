package com.example.moncvapp;

public class Experience {
    private String start;
    private String end;
    private String compagny;
    private String description;

    public Experience (String start, String end, String compagny, String description){
        this.start = start;
        this.end = end;
        this.compagny = compagny;
        this.description = description;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCompagny() {
        return compagny;
    }

    public void setCompagny(String compagny) {
        this.compagny = compagny;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
