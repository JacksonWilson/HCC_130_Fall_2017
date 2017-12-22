package labs.lab6b;

class Sphere {
	static double pi = 3.14;
	double radius;

	Sphere(double r) {
		radius = r;
	}

	double getVolume() {
		return 4.0 / 3 * pi * Math.pow(radius, 3);
	}
}