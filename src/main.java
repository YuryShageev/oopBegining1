public class main {
    public static void main(String[] args) {
        Human meetPerson1 = new Human();
        meetPerson1.yearOfBirth = 1988;
        meetPerson1.town = "Минск";
        meetPerson1.name = "Максим";
        System.out.println(meetPerson1);

        Human meetPerson2 = new Human();
        meetPerson2.yearOfBirth = 1993;
        meetPerson2.town = "Москва";
        meetPerson2.name = "Аня";
        System.out.println(meetPerson2);

        Human meetPerson3 = new Human();
        meetPerson3.yearOfBirth = 1992;
        meetPerson3.town = "Калининград";
        meetPerson3.name = "Катя";
        System.out.println(meetPerson3);

        Human meetPerson4 = new Human();
        meetPerson4.yearOfBirth = 1995;
        meetPerson4.town = "Москва";
        meetPerson4.name = "Артём";
        System.out.println(meetPerson4);
    }
}
