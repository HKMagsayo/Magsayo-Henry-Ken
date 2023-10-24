package Speed;

public class StudentInfo {
    private String first = " ";
    private String middle = " ";
    private String last = " ";
    private String suffix = " ";

    // Default constructor
    public StudentInfo() {
        // Default constructor
    }

    // Getters
    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String getSuffix() {
        return suffix;
    }

    // Setters
    public void setFirst(String fName) {
        first = fName;
    }

    public void setMiddle(String mName) {
        middle = mName;
    }

    public void setLast(String lName) {
        last = lName;
    }

    public void setSuffix(String sfx) {
        suffix = sfx;
    }

    // Method to get the full name
    public String getFullName() {
        return first + " " + middle + ". " + last + " " + suffix + ".";
    }
}
