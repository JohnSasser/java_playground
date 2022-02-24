public class Rock {
    
    // to have private variables on a public class, you must have GETTER and SETTER functions;

    private String color;
    private float weight;

    public Rock(String color, float weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    public Rock() {
        this.color = "Grey";
        this.weight = 20f;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return " Rock [color=" + color + ", weight=" + weight + "]";
    }


    
}
