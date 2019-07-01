package creationalPaterns.builder;

public class MainClass {

    public static void main(String[] args) {
        User eyyup = new User.UserBuilder("Eyyüp", "Bağdaş")
                .age(26)
                .phone("+90 216 504 5655")
                .address("Akasya Acıbadem Ofis Kuleleri\n A Blok 24. Kat No:127\n Acıbadem İstanbul Turkey")
                .build();

        User kevser = new User.UserBuilder("Kevser", "Köse")
                .age(22)
                .phone("+90 216 504 5655")
                .build();

        User merve = new User.UserBuilder("Merve", "Topal")
                .age(22)
                .build();

        System.out.println(eyyup);
        System.out.println(kevser);
        System.out.println(merve);
    }
    
}