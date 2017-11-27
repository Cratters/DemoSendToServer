package demo.com.demosendtoserver;

import java.util.ArrayList;

/**
 * Created by auser on 2017/11/27.
 */

public class Person {

    String name;
    int age;
    boolean isMale;
    Data data;
    ArrayList<String> favorites = new ArrayList<>();

    public Person() {
        this("王小明", 28, true, new Data(), null);
    }

    public Person(String name, int age, boolean isMale, Data data, ArrayList<String> favorites) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.data = data;
        if(favorites == null) {
            this.favorites.add("看電影");
            this.favorites.add("打球");
            this.favorites.add("寫程式");
            this.favorites.add("吃零食");
        } else
            this.favorites = favorites;
    }

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

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public ArrayList<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(ArrayList<String> favorites) {
        this.favorites = favorites;
    }
}
