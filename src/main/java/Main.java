public class Main {


    public static void main(String[] args) {
        TriangleBalancer triangleBalancer = new TriangleBalancer();
        float value = 1.5f;

        System.out.println("Начальные значение");
        System.out.println("a = " + triangleBalancer.getA());
        System.out.println("b = " + triangleBalancer.getB());
        System.out.println("c = " + triangleBalancer.getC());
        System.out.println("Сумма = " + (triangleBalancer.getSum()));
        System.out.println("Меняем значение a на " + value);

        triangleBalancer.addA(value);


        System.out.println("a = " + triangleBalancer.getA());
        System.out.println("b = " + triangleBalancer.getB());
        System.out.println("c = " + triangleBalancer.getC());
        System.out.println("Сумма = " + (triangleBalancer.getSum()));
    }




}
