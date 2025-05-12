import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
    String name;
    String surname;
    String age;

    public Person(String name,String surname , String age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getAge(){
        return age;
    }

    @Override
    public int compareTo(Person other){
        return this.age.compareTo(other.age);
    }

    @Override
    public String toString(){
        return "Name: "+name+",Surname: "+surname+",Age: "+age;
    }
}


public class Main4 {
    public static void main(String[] args) {
        ArrayList<Person> persons= new ArrayList<>();
        persons.add(new Person("Inzhu" , "Duissenabay" , "17"));
        persons.add(new Person("Almas" , "?" , "18"));
        persons.add(new Person("Daniel" , "Duissenabay" , "21"));
        persons.add(new Person("Stiven" , "Job" , "22"));
        persons.add(new Person("Zhuldyz" , "Almyrzaeva", "18"));
        persons.add(new Person("Nurma" , "Duissenabay" , "31"));
        persons.add(new Person("Jennie" , "Lim" , "22"));
        persons.add(new Person("Stiven" , "?" , "24"));

        Collections.sort(persons);
        for (Person x : persons) {
            System.out.println(x);
        }

    }
}

