import java.time.LocalDate;

public class Human {

    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
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
        if (yearOfBirth >= 100) {
            this.yearOfBirth = yearOfBirth;
        } else if (yearOfBirth > 0 && yearOfBirth < 100) {
            this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
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
        name = "Информация не указана";
        town = "Информация не указана";
        yearOfBirth = 1900;
        jobTitle = "Информация не указана";
        new Human(name, town, yearOfBirth, jobTitle);
    }

    void meetPerson() {
        System.out.println("Привет!");
        System.out.println("Меня зовут " + name);
        System.out.println("Мне " + yearOfBirth + " лет");
        System.out.println("Я из города " + town);
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
