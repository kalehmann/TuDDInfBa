public class Adel extends Einwohner {
	@Override public int steuer() {
		return Math.max(20, super.steuer());
	}
}
