package teste.teste.model;

public class TesteApiModelCreators {


    private String id;
    private String firstName;

    public TesteApiModelCreators( String id, String firstName ) {
        this.id = id;
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId( String code ) {
        this.id = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String status ) {
        this.firstName = status;
    }

    @Override
    public String toString() {
        return "TesteApiModelCreators{" +
                "code='" + id + '\'' +
                ", status='" + firstName + '\'' +
                '}';
    }

}
