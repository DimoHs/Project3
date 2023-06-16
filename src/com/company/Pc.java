package com.company;

class Pc {
    private String brand;
    private String model;
    private int productionYear;
    private int priceBgn;
    private int ramMemoryGB;
    private int hddMemoryGB;
    private String operatingSystem;




    Pc(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    Pc(String brand, String model, int priceBgn) {
        this.brand = brand;
        this.model = model;
        this.priceBgn = priceBgn;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }
    public int getPriceBgn() {
        return this.priceBgn;
    }



    public String getDetails() {
        String output = ("Brand:"+getBrand()+"\n" +"Model:"+getModel());

        return output;
    }
    public String getDetails2() {
        String output2 = ("Brand:"+getBrand()+"\n" +"Model:"+getModel()+"\n"+"Price:"+getPriceBgn());

        return output2;
    }
}





