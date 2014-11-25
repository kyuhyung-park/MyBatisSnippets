package exam;

/**
 * Created by Administrator on 2014-11-25.
 */
public class Model1 {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Model1{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
