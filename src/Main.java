public class Main {
    public static PhoneBook myPhoneBook = new PhoneBook("Petya Ivanov");

    public static void main(String[] args) {
        Contact father = new Contact("Fedor", "Ivanov", "22-22-22");
        Contact mother = new Contact("Nina", "Ivanova", "22-22-23");
        Contact brother = new Contact("Ivan", "Ivanov", "22-22-24");
        String groupFamily = "Family";
        myPhoneBook.addContact(groupFamily, father);
        myPhoneBook.addContact(groupFamily, mother);
        myPhoneBook.addContact(groupFamily, brother);

        Contact college1 = new Contact("Yana", "Petrova", "33-33-33");
        Contact college2 = brother;
        Contact manager = new Contact("Evgeniy", "Sidorov", "33-33-35");
        GroupList workList = new GroupList();
        workList.addContact(college1);
        workList.addContact(college2);
        workList.addContact(manager);
        myPhoneBook.addContactList("Work", workList);

        System.out.println(myPhoneBook.toString());

        System.out.println(myPhoneBook.findByGroupAndName("Work", "Ivan"));
        System.out.println(myPhoneBook.findByGroupAndName("Work", "Petrova"));
        System.out.println(myPhoneBook.findByGroupAndName("Family", "Ivan Ivanov"));
        System.out.println(myPhoneBook.findByNumber("33-33-35"));
    }

}
