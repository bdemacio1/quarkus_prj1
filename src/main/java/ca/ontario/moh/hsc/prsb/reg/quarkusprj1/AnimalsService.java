package ca.ontario.moh.hsc.prsb.reg.quarkusprj1;

import java.util.ArrayList;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AnimalsService {

    private static ArrayList<Animal> animalList = new ArrayList<>();

    // AnimalsService(){
    //     animalList.add(new Animal("Tiger", "Orange", "Large"));
    //     animalList.add(new Animal("Wolf", "Grey", "Medium"));
    //     animalList.add(new Animal("Snowy Owl", "White", "Small"));
    // }
    static{
        //init
        animalList.add(new Animal("Tiger", "Orange", "Large"));
        animalList.add(new Animal("Wolf", "Grey", "Medium"));
        animalList.add(new Animal("Snowy Owl", "White", "Small"));

    }

    public Animal byName(String name) {
        for (Animal animal : animalList){
            if(animal.getName().equals(name)){
                return animal;
            }
        }
        return new Animal(null, null, null);
    }

    public ArrayList<Animal> all(){
        return animalList;
    }

}