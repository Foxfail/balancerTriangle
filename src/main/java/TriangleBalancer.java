public class TriangleBalancer {
    // R^2=(x-x0)^2+(y-y0)^2+(z-z0)^2  -- формула шара

    private float a = 0.50f;
    private float b = 0.50f;
    private float c = 0.50f;

    private float limit = 1.0f;


    public void addA(float value){
        if (value > limit || (a < 0 && (b - value / 2) < 0 && (c - value / 2) < 0)){
            System.out.println("Выход за границы сферы допустимых значений!");
            throw new IndexOutOfBoundsException();
        } else {
            a = a + value;
            b = b - value / 2;
            c = c - value / 2;
        }
    }
    public void addB(float value){
        if (value > limit || ((a - value / 2) < 0 && b < 0 && (c - value / 2) < 0)){
            System.out.println("Выход за границы сферы допустимых значений!");
            throw new IndexOutOfBoundsException();
        } else {
            a = a - value / 2;
            b = b + value;
            c = c - value / 2;
        }
    }
    public void addC(float value){
        if (value > limit || (a < 0 && (b - value / 2) < 0 && (c - value / 2) < 0)){
            System.out.println("Выход за границы сферы допустимых значений!");
            throw new IndexOutOfBoundsException();
        } else {
            a = a - value / 2;
            b = b - value / 2;
            c = c + value;
        }
    }


    // GETTERS
    public float getA() {
        return a;
    }
    public float getB() {
        return b;
    }
    public float getC() {
        return c;
    }

    public float getSum(){
        return a+b+c;
    }
}
