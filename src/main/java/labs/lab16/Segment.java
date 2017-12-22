package labs.lab16;

public class Segment implements Measurable {
    private Point p1;
    private Point p2;

    public Segment(double p1x, double p1y, double p2x, double p2y) {
        this.p1 = new Point(p1x, p1y);
        this.p2 = new Point(p2x, p2y);
    }

	@Override
	public double calc_distance() {
		return Math.sqrt(Math.pow(p1.x_coord - p2.x_coord, 2) + Math.pow(p1.y_coord - p2.y_coord, 2));
	}
}