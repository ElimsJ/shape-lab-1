public abstract class shape {
    private String type;

    public Shape(String type)
    {
        this.type = type;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString()
    {
        return "I am a " + type + ".";
    }

    public class ETriangle extends shape
    {
        private int side;
        public ETriangle(int side)
        {
            super(type:"ETriangle");
            this.side = side;
        }
        public double getArea()
        {
            return 0.433*(side*side);
        }
        public double getPerimeter();
        {
            return side*3;
        }
    }
}
