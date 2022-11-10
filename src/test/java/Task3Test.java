import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @Test
    public void test1(){
        Ball ball = new Ball(0);
        Ball ball2 = new Ball(5);
        Pyramid pyramid = new Pyramid(10, 10);
        assertEquals(ball.getVolume(),0);
        assertEquals(ball2.getVolume(),523.5987755982989);
        assertEquals(pyramid.getVolume(),133.33333333333334);
    }
}
