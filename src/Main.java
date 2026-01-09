void main() {
//    User john = new User("John", 1954, 2, 18);
    User john = new User("John", 1954, 1, 9);
    john.displayInfo();
    john.displayHappyBirthday();

    Admin nicolas = new Admin("Nicolas", 2006, 1, 9);
    nicolas.displayInfo();
//    nicolas.displayInfo(true);
//    nicolas.displayInfo(false);
    nicolas.displayHappyBirthday();
}
