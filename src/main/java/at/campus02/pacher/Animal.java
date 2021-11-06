/*
Name: Pacher Michael
Email: 52103994@edu.campus02.com
*/

package at.campus02.pacher;

public class Animal {

    private String name;
    private String species;
    private String animalLoud;
    private int age;

    public Animal(String name, int age, String species, String animalLoud) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.animalLoud = animalLoud;
    }

    //region getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }
    //endregion


    //region public methods
    //Return the animal loud
    public String giveAnimalLoud(){
        return animalLoud;
    }

    //Get the name and age
    public String getNameAndAge(){
        return String.format("%s,%d",name,age);
    }

    //Get animal category
    public String getAnimalCategory(){
        if(0 <= age && age <= 2){
            return "baby animal";
        }
        else if(2 < age && age <= 4){
            return "young animal";
        }
        else if(age > 4){
            return "old animal";
        }
        return "";
    }
    //endregion
}
