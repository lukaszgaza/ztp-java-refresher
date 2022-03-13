import java.util.Objects;

public class Tuple<V1 extends Comparable<V1>, V2 extends Comparable<V2>> implements Comparable<Tuple<V1, V2>> {
    private final V1 first;
    private final V2 second;

    public Tuple(V1 first, V2 second) {
        this.first = first;
        this.second = second;
    }

    public V1 getFirst() {
        return this.first;
    }

    public V2 getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return "Tuple<" + first + ", " + second + '>';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple<?, ?> tuple = (Tuple<?, ?>) o;
        return Objects.equals(first, tuple.first) && Objects.equals(second, tuple.second);
    }

    @Override
    public int compareTo(Tuple<V1, V2> o) {
        if (getFirst().compareTo(o.getFirst()) != 0) {
            return getFirst().compareTo(o.getFirst());
        } else {
            return getSecond().compareTo(o.getSecond());
        }
    }
}
