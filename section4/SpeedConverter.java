package section4;

public class SpeedConverter {

	public static long toMilesPerHour(final double kilometersPerHour) {
		final long x = kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
		return x;
	}

	public static void printConversion(final double kilometersPerHour) {
		final long x = toMilesPerHour(kilometersPerHour);
		if (x == -1) {
			System.out.println("Invalid Value");
		} else {
			System.out.println(kilometersPerHour + " km/h = " + x + " mi/h");
		}
	}

}
