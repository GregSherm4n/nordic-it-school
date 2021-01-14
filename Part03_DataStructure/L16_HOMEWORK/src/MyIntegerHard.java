import java.util.HashSet;

public class MyIntegerHard implements Comparable<MyIntegerHard> {

    private Integer value;

    public MyIntegerHard() {
        super();
    }

    public MyIntegerHard(Integer value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer numOfDiffNum(Integer value) {

        var set = new HashSet<Integer>();

        while (value / 10 > 0) {
            set.add(value % 10);
            value = value / 10;
        }

        return set.size();

    }

    @Override
    public int compareTo(MyIntegerHard o) {
        return numOfDiffNum(this.value).compareTo(numOfDiffNum(o.value));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyIntegerHard other = (MyIntegerHard) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
