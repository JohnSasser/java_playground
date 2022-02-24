import java.util.ArrayList;

public class CaveMan {
// right click ---- SOURCE ACTION --
// selected ------  GENERATE CONSTRUCTOR;


    // adding PRIVATE to variable makes it local to .this class of CaveMan;
    private String name;
    private int age;
    private float weight;
    private ArrayList<Rock> rockCollection;

    // created this public constructor;


    // parameterized constructor
    public CaveMan(String n, int a, float w, ArrayList<Rock> rocks) {
        this.name = n;
        this.age = a;
        this.weight = w;
        this.rockCollection = rocks;
    }

    // default constructor -- no initial values;
    public CaveMan() {
        this.name = "dont have one yet :-(";
        this.age = 0;
        this.weight = 0f;
        this.rockCollection = new ArrayList<>();
    }

//  VOID MEANS THERE IS NO RETURN DATA FROM FUNCTION;
    public void sayHi() {
        System.out.println("Hi my name is " + this.name + ", I weigh " + this.weight + ", & I am " + this.age + " years old");
    }


// generating GETTERS and SETTERS;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

 
    // generate toString() Method to display in main program;
    @Override
    public String toString() {
        return "CaveMan: age=" + age + ", name=" + name + ", weight=" + weight + " rock collection=" + rockCollection;
    }

    public ArrayList<Rock> getRockCollection() {
        return rockCollection;
    }

    public void setRockCollection(ArrayList<Rock> rockCollection) {
        this.rockCollection = rockCollection;
    }


}