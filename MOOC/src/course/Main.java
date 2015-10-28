package course;

public class Main {

	public static void main(String[] args) {

		Person pekka = new Person("Pekka");
		Person andrew = new Person("Andrew");

		pekka.becomeOlder();
        pekka.becomeOlder();

        andrew.becomeOlder();

        System.out.println( "Age of Pekka: "+pekka.getAge() );
        System.out.println( "Age of Andrew: "+andrew.getAge() );

        int total = pekka.getAge() + andrew.getAge();

        System.out.println( "Pekka and Andrew total of "+total+ " years old" );
	}
}
