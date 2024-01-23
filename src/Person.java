public class Person {

    public static String personInfo(String firstName, String lastName, String city, int phoneNumber) {
        return "Зателефонувати громадянинові " + firstName + " " + lastName +
                " з міста " + city + " можна за номером " + phoneNumber + ".";
    }

    public static void main(String[] args) {

        System.out.println(Person.personInfo("Anna", "S", "Kyiv", 293672));
        System.out.println(Person.personInfo("Jenni", "C", "Lemberg",2769814  ));
        System.out.println(Person.personInfo("Svitlana", "H", "Rivne", 377421));
    }
}
