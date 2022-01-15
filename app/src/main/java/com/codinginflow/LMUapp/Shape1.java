package com.codinginflow.LMUapp;

class Shape1
{
    private String id1;
    private String name1;
    private String zeit_mensa;
    private String urladress;
    private String adresse;

    public Shape1(String id1, String name1, String zeit_mensa, String urladress, String adresse) {
        this.id1 = id1;
        this.name1= name1;
        this.zeit_mensa = zeit_mensa;
        this.urladress = urladress;
        this.adresse = adresse;
    }


    public String getId1() {
        return id1;
    }
    public String getUrl() {
        return urladress;
    }
    public String getAdresse() {
        return adresse;
    }

    public void setId1(String id) {
        this.id1 = id;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name) {
        this.name1 = name;
    }

    public String getZeit() {
        return zeit_mensa;
    }

    public void setImage1(int image) {
        this.zeit_mensa = zeit_mensa;
    }


}
