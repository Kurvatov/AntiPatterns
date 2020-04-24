
public class Point {

    private Integer _x;
    private Integer _y;

    public Point(Integer _x, Integer _y) {
        this._x = _x;
        this._y = _y;
    }

    public Integer getX() {
        return _x;
    }

    public void setX(Integer x) {
        this._x = x;
    }

    public Integer getY() {
        return _y;
    }

    public void setY(Integer y) {
        this._y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", getX(), getY());
    }
}