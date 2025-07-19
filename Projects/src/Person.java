import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String cast;
    Person() {

    }
    Person(String name, String cast) {
        this.name = name;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public void setName(String name) {
        this.name = name;
    }
}
