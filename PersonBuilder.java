public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age > -1) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Не верно указан возраст");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (surname == null) {
            throw new IllegalStateException("Не верно указано имя или фамилия");
        }
        return new Person(name, surname, age, address);
    }
}
