package practice.tmdb.com.tmdb.data;

import java.util.ArrayList;

public class ContactData {
    private String mName;
    private boolean mOnline;

    public ContactData(String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    public String getName() {
        return mName;
    }

    public boolean isOnline() {
        return mOnline;
    }

    private static int lastContactId = 0;

    public static ArrayList<ContactData> createContactsList(int numContacts) {
        ArrayList<ContactData> contacts = new ArrayList<ContactData>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new ContactData("Person " + ++lastContactId, i <= numContacts / 2));
        }

        return contacts;
    }
}
