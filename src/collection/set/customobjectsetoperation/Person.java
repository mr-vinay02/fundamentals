package collection.set.customobjectsetoperation;

public class Person {

    String personName;
    int personAge;

    public Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public boolean equals(Object object) {
        Person  person = (Person)object;
        return this.personName.equals(person.getPersonName());
    }

    @Override
    public int hashCode() {
        return this.getPersonName().hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}
