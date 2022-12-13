public class Department {

    private String name;
    private int numOfEmployees;
    private String email;


    public Department(String name, int numOfEmployees, String email) {
        this.name = name;
        this.numOfEmployees = numOfEmployees;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", numOfEmployees=" + numOfEmployees +
                ", Email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Department) {
            return numOfEmployees == ((Department) obj).numOfEmployees;
        }

        return false;
    }
}
