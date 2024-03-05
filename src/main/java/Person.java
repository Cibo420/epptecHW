import java.util.List;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private Job job;
    private boolean isMarried;
    private List<String> children;


    public Person(String name, int age, int height, int weight, Job job, boolean isMarried, List<String> children) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.job = job;
        this.isMarried = isMarried;
        this.children = children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Job getJob() {
        return job;
    }
    public Job setJob(Job job) {
        return this.job = job;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return
                name +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                        ",kids " + children +
                " works as " + job
                + ", isMarried=" + isMarried;
    }
}
