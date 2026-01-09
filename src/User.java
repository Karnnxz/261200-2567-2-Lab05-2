import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }

    public Boolean isBirthday() {
        LocalDate currentTime = LocalDate.now();
        return currentTime.getDayOfMonth() == this.dob.getDayOfMonth() && currentTime.getMonthValue() == this.dob.getMonthValue();
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }

}