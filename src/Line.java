import java.util.ArrayList;

public class Line {
    private String _name;
    public ArrayList<Point> _line = new ArrayList<Point>();

    public Line(String _name) {
        this._name = _name;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void addPoint(Point point) {
        this._line.add(point);
    }

    public void printLine(){
        _line.forEach(point -> System.out.println(point.toString()));
    }
}
