import java.util.Arrays;
import java.lang.String;
public class ArraysExercies {
    public static Person[] addPerson(Person[] personArray, Person newPerson){
        int length = (personArray.length);
        Person[] newPersonArray;
        newPersonArray = Arrays.copyOf(personArray,length+1);
        newPersonArray[length] = newPerson;
        return newPersonArray;
    }
    public static void main(String[] args){
        Person kyle = new Person();
        Person jade = new Person();
        Person twilight = new Person();
        Person kyziko = new Person();
        kyle.setName("kyle");
        jade.setName("jade");
        twilight.setName("twilight");
        kyziko.setName("kyziko");

        Person[] People = {kyle,jade,twilight};
        Person[] newPeople = addPerson(People,kyziko);
        for(int i=0;i<People.length;i++) {
            System.out.println(People[i].name);
        }
        for(int i=0;i<newPeople.length;i++) {
            System.out.println(newPeople[i].name);
        }
    }
}
