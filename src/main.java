public class main {
    public static void main(String[] args) {


        Human meetPerson = new Human();
//        meetPerson.name = "Юра";
        meetPerson.yearOfBirth = 33;
        meetPerson.town = "Краснодар";
        meetPerson.meetPerson();

        Human meetPerson1 = new Human("Максим", "Минск", 1988, "Бренд Менеджер");
//        meetPerson1.yearOfBirth = 1988;
//        meetPerson1.town = "Минск";
//        meetPerson1.name = "Максим";
//        meetPerson1.jobTitle = "Бренд Менеджер";
        System.out.println(meetPerson1);

        Human meetPerson2 = new Human("Аня", "Москва", 1993, "Методист образовательных программ");
//        meetPerson2.yearOfBirth = 1993;
//        meetPerson2.town = "Москва";
//        meetPerson2.name = "Аня";
//        meetPerson2.jobTitle = "Методист образовательных программ";
        System.out.println(meetPerson2);

        Human meetPerson3 = new Human("Катя", "Калининград", 1992, "Продакт-Менеджер");
//        meetPerson3.yearOfBirth = 1992;
//        meetPerson3.town = "Калининград";
//        meetPerson3.name = "Катя";
//        meetPerson3.jobTitle = "Продакт-Менеджер";
        System.out.println(meetPerson3);

        Human meetPerson4 = new Human("Артём", "Москва", 1995, "Директор по развитию бизнеса");
//        meetPerson4.yearOfBirth = 1995;
//        meetPerson4.town = "Москва";
//        meetPerson4.name = "Артём";
//        meetPerson4.jobTitle = "Директор по развитию бизнеса";
        System.out.println(meetPerson4);
    }
}
