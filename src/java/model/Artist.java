package model;

public class Artist {

    private String name;
    private int age;
    private String gender;

    /**
     * Constructor for the Artist class
     * @param name the name of the Artist
     * @param age the age of the Artist
     * @param gender the gender of the Artist
     */
    public Artist(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
