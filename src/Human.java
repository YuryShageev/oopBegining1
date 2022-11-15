public class Human {

    int yearOfBirth;
    String name;
    String town;

    void meetPerson(int yearOfBirth, String name, String town) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;

    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности. Будем знакомы!";
    }
}
