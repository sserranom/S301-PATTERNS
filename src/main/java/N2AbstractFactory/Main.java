package N2AbstractFactory;

import N2AbstractFactory.abstractFabric.AddressBookFactory;
import N2AbstractFactory.client.AddressBook;
import N2AbstractFactory.concrectFabric.InternationalAddressBookFactory;
import N2AbstractFactory.concrectFabric.NationalAddressBookFactory;

public class Main {
    public static void main(String[] args) {


        AddressBookFactory nationalFactory = new NationalAddressBookFactory();
        AddressBook nationalAddressBook = new AddressBook(nationalFactory, "Main Street", "123", "5", "A", "Catalonia", "Barcelona", "Spain", "08001", "612345678");

        System.out.println("National Address Book:");
        nationalAddressBook.showAdressBook();

        System.out.println();

        AddressBookFactory internationalFactory = new InternationalAddressBookFactory();

        AddressBook internationalAddressBook = new AddressBook(internationalFactory, "direcicion depeurba, xxxx", "miami", "EEUU", "02546", "+1", "844464646");

        System.out.println("International Address Book: ");
        internationalAddressBook.showAdressBook();

    }

}
