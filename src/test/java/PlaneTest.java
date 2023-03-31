import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasTypeWeightCapacity(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
        assertEquals(10, plane.getPlaneType().getCapacity());
        assertEquals(500, plane.getPlaneType().getWeight());
    }
}
