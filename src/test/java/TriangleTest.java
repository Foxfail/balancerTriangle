import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


class TriangleTest {

    private TriangleBalancer triangleBalancer;

    @BeforeEach
    void BeforeAll(){
        triangleBalancer = new TriangleBalancer();
    }

    @Test
    void firstTest(){
        triangleBalancer.addA(0.25f);


        Assertions.assertEquals(1.5f, triangleBalancer.getSum());
        Assertions.assertEquals(0.75f, triangleBalancer.getA());
        Assertions.assertEquals(0.375, triangleBalancer.getB());
        Assertions.assertEquals(0.375, triangleBalancer.getC());

        printInfo();
    }

    @Test
    void secondTest(){
        firstTest();

        triangleBalancer.addB(0.25f);

        Assertions.assertEquals(1.5f, triangleBalancer.getSum());
        Assertions.assertEquals(0.75f-(0.25f/2), triangleBalancer.getA());
        Assertions.assertEquals(0.375+0.25f, triangleBalancer.getB());
        Assertions.assertEquals(0.375-(0.25f/2), triangleBalancer.getC());

        printInfo();
    }

    @Test
    void thirdTest(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, new Executable() {
            public void execute() throws Throwable {
                System.out.println("!ADDSFGSDFGDFGDFGDFHHYUIUIYU");
                triangleBalancer.addC(1.5f);
            }
        });

        printInfo();
    }

    private void printInfo(){
        System.out.println("a = " + triangleBalancer.getA());
        System.out.println("b = " + triangleBalancer.getB());
        System.out.println("c = " + triangleBalancer.getC());
        System.out.println("Сумма = " + (triangleBalancer.getSum()));
    }
}
