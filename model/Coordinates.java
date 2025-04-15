package model;

public class Coordinates {
    private Long x;
    private Long y;
    // не  null

    @Override
    public String toString() {
        return String.format("(x=%d, y=%d)", x, y);
    }

    public Coordinates(Long x, Long y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры (getX(), getY())
    public Long getX() { return x; }
    public Long getY() { return y; }
}

