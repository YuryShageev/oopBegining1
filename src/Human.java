public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        this();
        if (name == null) {
            System.out.println("Информация не указана");
        } else {
            this.name = name;
        }
        if (town == null) {
            System.out.println("Информация не указана");
        } else {
            this.town = town;
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (jobTitle == null) {
            System.out.println("Информация не указана");
        } else {
            this.jobTitle = jobTitle;
        }
    }

    Human() {
        name = "Чувак";
        town = "Кудыкина гора";
        yearOfBirth = 1900;
        jobTitle = "Пенёк";
    }

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
