package com.fusner.Exercise9;

public class Main
{
    public static void main(String[] args)
    {
        ContactEmail contactEmail = new ContactEmail("Email", "email@example.com");
        ContactPhone contactPhone = new ContactPhone("Phone", "000-0001");
        contactEmail.contact();
        contactPhone.contact();
    }
}

abstract class Contact
{
    private String name;

    public Contact(String name)
    {
        this.name = name;
    }

    abstract public void contact();
}

class ContactEmail extends Contact
{
    private String email;

    public ContactEmail(String name, String email)
    {
        super(name);
        this.email = email;
    }

    @Override
    public void contact()
    {
        System.out.println("Emailing " + this.email);
    }
}

class ContactPhone extends Contact
{
    private String phone;

    public ContactPhone(String name, String phone)
    {
        super(name);
        this.phone = phone;
    }

    @Override
    public void contact()
    {
        System.out.println("Calling " + this.phone);
    }
}
