package contract.util;

public class Nuls {

    private long value;

    public static Nuls ONE = Nuls.valueOf(100000000L);
    public static Nuls ZERO = Nuls.valueOf(0L);

    public Nuls() {
    }

    public static Nuls valueOf(long i) {
        return new Nuls(i);
    }

    private Nuls(long value) {
        this.value = value;
    }

    public Nuls plus(Nuls na){
        return Nuls.valueOf(this.value + na.value);
    }

    public Nuls plus(long value){
        return Nuls.valueOf(this.value + value);
    }

    public Nuls minus(Nuls na){
        return Nuls.valueOf(this.value - na.value);
    }

    public Nuls minus(long value){
        return Nuls.valueOf(this.value - value);
    }

    public Nuls multiply(Nuls na){
        return Nuls.valueOf(this.value * na.value);
    }

    public Nuls multiply(long value){
        return Nuls.valueOf(this.value * value);
    }

    public Nuls divide(Nuls na){
        return Nuls.valueOf(this.value / na.value);
    }

    public Nuls divide(long value){
        return Nuls.valueOf(this.value / value);
    }


    public long value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nuls na = (Nuls) o;

        return value == na.value;
    }

    @Override
    public int hashCode() {
        return (int) (value ^ (value >>> 32));
    }

    @Override
    public String toString() {
        return "Nuls{" +
                "value=" + value +
                '}';
    }
}
