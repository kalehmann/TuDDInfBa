public class Einwohner {
	protected int einkommen = 0;

	public int zuVersteuerndesEinkommen() {
		return this.einkommen;
	}

	public int steuer() {
		return Math.max(1, (int) Math.floor(0.1 * this.zuVersteuerndesEinkommen()));
	}

	public void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}
}
