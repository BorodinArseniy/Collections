import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("AB", "8919491491");
    }
    HashMap<String, String> contacts = new HashMap<>();

    public void addContact(String name, String num){
        contacts.put(name, num);
    }

    public void removeContact(String name){
        contacts.remove(name);
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "contacts=" + contacts +
                '}';
    }



}
