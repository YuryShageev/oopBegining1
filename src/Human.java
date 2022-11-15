public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    void meetPerson() {
        System.out.println("Привет!");
        System.out.println("Меня зовут " + name);
        System.out.println("Мне " + yearOfBirth + " лет");
        System.out.println("Я из города " + town);
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
