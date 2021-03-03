package ca.ontario.moh.hsc.prsb.reg.quarkusprj1;

public class Animal {
    //Comment to test pipeline trigger 5
    String name;
    String color;
    String size;

    public Animal(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    } 
}
