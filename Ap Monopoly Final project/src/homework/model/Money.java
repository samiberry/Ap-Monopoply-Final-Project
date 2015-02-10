package homework.model;

public enum Money {

    ONE(1) , FIVE(5) , TEN(10), TWENTY(20), FIFTY(50), ONE_HUNDRED(100), FIVE_HUNDRED(500);

    private int value;

    private Money(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
