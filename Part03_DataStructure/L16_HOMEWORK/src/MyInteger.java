import java.util.Iterator;

public class MyInteger implements Comparable<MyInteger> {

    private Integer number;

    public MyInteger() {
        super();
    }

    public MyInteger(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((number == null) ? 0 : number.hashCode());
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
        MyInteger other = (MyInteger) obj;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MyInteger [number=" + number + "]";
    }

    public Integer numOfPrimeDivisors(Integer number) {
        var count = 1;
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                number /= i;
                count++;
            }
        }
        return count;
    }

    public Integer numOfDigits() {
        Integer temp = number;
        var count = 1;
        while (temp / 10 > 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    @Override
    public int compareTo(MyInteger o) {
        return numOfPrimeDivisors(this.number).compareTo(numOfPrimeDivisors(o.getNumber()));
    }

}
