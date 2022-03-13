import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {

    @Test
    public void shouldBeAbleToCreateSameTypeInstances() {
        var tuple = new Tuple<>("a", "b");

        assertEquals("a", tuple.getFirst());
        assertEquals("b", tuple.getSecond());
    }

    @Test
    public void shouldBeAbleToCreateDifferentTypeInstances() {
        var tuple = new Tuple<>("a", 123);

        assertEquals("a", tuple.getFirst());
        assertEquals(123, tuple.getSecond());
    }

    @Test
    public void shouldReturnStringRepresentationForSameTypeInstances() {
        var tuple = new Tuple<>("a", "b");
        assertEquals("Tuple<a, b>", tuple.toString());
    }

    @Test
    public void shouldReturnStringRepresentationForDifferentTypeInstances() {
        var tuple = new Tuple<>("a", 123);
        assertEquals("Tuple<a, 123>", tuple.toString());
    }

    @Test
    public void shouldReturnTrueComparingEqualObjects() {
        var tuple1 = new Tuple<>("a", "b");
        var tuple2 = new Tuple<>("a", "b");

        assertEquals(tuple1, tuple2);
    }

    @Test
    public void shouldReturnFalseComparingDifferentObject() {
        var tuple1 = new Tuple<>("a", "b");
        var tuple2 = new Tuple<>("a", 123);

        assertNotEquals(tuple1, tuple2);
    }

    @Test
    public void shouldReturnFalseComparingNull() {
        var tuple1 = new Tuple<>("a", "b");

        assertNotEquals(tuple1, null);
    }

    @Test
    public void shouldCorrectlyCompare() {
        var tuple1 = new Tuple<>("a", 1);
        var tuple2 = new Tuple<>("b", 1);

        var list = new LinkedList<Tuple<String, Integer>>();
        list.add(tuple2);
        list.add(tuple1);

        Collections.sort(list);

        assertEquals(tuple1, list.get(0));
    }

    @Test
    public void shouldCorrectlyCompare2() {
        var tuple1 = new Tuple<>("c", 1);
        var tuple2 = new Tuple<>("b", 1);

        var list = new LinkedList<Tuple<String, Integer>>();
        list.add(tuple1);
        list.add(tuple2);

        Collections.sort(list);

        assertEquals(tuple2, list.get(0));
    }

    @Test
    public void shouldCorrectlyCompar3() {
        var tuple1 = new Tuple<>("a", 1);
        var tuple2 = new Tuple<>("a", 2);

        var list = new LinkedList<Tuple<String, Integer>>();
        list.add(tuple2);
        list.add(tuple1);

        Collections.sort(list);

        assertEquals(tuple1, list.get(0));
    }

    @Test
    public void shouldCorrectlyCompare4() {
        var tuple1 = new Tuple<>("a", 100);
        var tuple2 = new Tuple<>("a", 2);

        var list = new LinkedList<Tuple<String, Integer>>();
        list.add(tuple1);
        list.add(tuple2);

        Collections.sort(list);

        assertEquals(tuple2, list.get(0));
    }
}
