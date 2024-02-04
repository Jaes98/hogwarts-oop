public class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    // public Person(String firstName, String lastName) {
    //     this(firstName, null, lastName);
    // }
    // public Person(String fullName) {
    //     setFullName(fullName);
    // }
    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    public Person() {}

    public String toString() {
        if(hasMiddleName() == true) {
            return firstName + " " + middleName + " " + lastName;
    } else {
        return firstName + " " + lastName;
    }
    }
    // public String getFirstName() {
    //     return firstName;
    // }
    // public void setFirstName(String name) {
    //     firstName = name;
    // }
    // public String getMiddleName() {
    //     return middleName;
    // }
    // public void setMiddleName(String name) {
    //     middleName = name;
    // }
    // public String getLastName() {
    //     return lastName;
    // }
    // public void setLastName(String name) {
    //     lastName = name;
    // }
    // String getFullName() {
    //     if(hasMiddleName() == true){
    //         return firstName + " " + middleName + " " + lastName; }
    //     else {
    //         return firstName + " " + lastName;
    //     }
    // }
    // void setFullName(String fullName) {
    //     String[] parts = fullName.split(" ");
    //     firstName = parts[0];
    //     lastName = parts[parts.length - 1];
    //     if(parts.length == 3) {
    //         middleName = parts[1];
    //     } else {
    //         middleName = null;
    //     }
    // }
    public boolean hasMiddleName() {
        return middleName != null;
    }
}