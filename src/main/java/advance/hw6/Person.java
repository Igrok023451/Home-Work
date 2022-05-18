package advance.hw6;

public class Person {
    String name;
    int old;
    String sex;

    public Person(String name, int old, String sex) {
        this.name = name;
        this.old = old;
        this.sex = sex;
    }

    public String getName() {
        String result;
        if (this.sex != null) {
            switch (this.sex.trim().toLowerCase()) {
                case "man":
                    result = "Mr. " + this.name;
                    break;
                case "woman":
                    result = "Mrs. " + this.name;
                    break;
                default:
                    result = "Enter correct sex person";
                    break;
            }
            return result;
        } else {
            result = "In name came NULL";
        }
        return result;
    }
}