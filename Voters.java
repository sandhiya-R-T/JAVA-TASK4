package ExceptionandCollection;

class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

class Voter {
    private int voterId;
    private String name;
    private int age;

        public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

        public int getVoterId() {
        return voterId;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("Invalid age for voter");
        }
        this.age = age;
    }
}

public class Voters {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1, "Alice", 20);
            System.out.println("Voter created successfully.");
        } catch (InvalidVoterAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
