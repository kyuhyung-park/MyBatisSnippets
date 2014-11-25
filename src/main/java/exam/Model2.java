package exam;

/**
 * Created by Administrator on 2014-11-25.
 */
public class Model2 {
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Model2{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
