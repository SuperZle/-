import java.io.Serializable;

public class Animal implements Serializable {
    private static final long serialVersionUID = 8541868773346495023L;
    private String name;
    private String col;
    //transient 瞬态
    private transient int age;
    private String gm;

    private String df;
    public Animal() {
    }

    public Animal(String name, String col, int age, String gm) {
        this.name = name;
        this.col = col;
        this.age = age;
        this.gm = gm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", col='" + col + '\'' +
                ", age=" + age +
                ", gm='" + gm + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGm() {
        return gm;
    }

    public void setGm(String gm) {
        this.gm = gm;
    }
}
