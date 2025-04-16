public class Leibeigener extends Bauer {
	@Override public int zuVersteuerndesEinkommen() {
		return Math.max(0, this.einkommen - 12);
	}
}
