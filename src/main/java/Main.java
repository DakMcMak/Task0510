public class Main {
    private String name;
    private int age;
    private int weight ;
    private String color;
    private String address;

    public void initialize(String name)
    {
        this.name = name;
    }


    public void initialize(String name, int age, char weight)
    {
        this.name =  name;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age)
    {
        this.name =  name;
        this.age = age;
    }

    public void initialize(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address)
    {
        this.color = color;
        this.weight = weight;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
