package OOP;

public class Human {
        private String lastName;
        private String firstName;
        private String middleName;
        private int age;
        private int clothingSize;

    public void displayInfo() {
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + middleName);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Размер одежды: " + clothingSize);
        System.out.println("------------------------");
    }

//    @Override
//    public String toString() {
//        return "Human{" +
//                "lastName='" + lastName + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", middleName='" + middleName + '\'' +
//                ", age=" + age +
//                ", clothingSize=" + clothingSize +
//                '}';
//    }

    // Геттеры и сеттеры
        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    public int getClothingSize() {
        return clothingSize;
    }

    public void setClothingSize(int clothingSize) {
        this.clothingSize = clothingSize;
    }
}

