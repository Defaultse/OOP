
public class Temperature {
	private double temperature;
	private char scale; // C or F

	public Temperature() {
		// default
		this.temperature = 0;
		this.scale = 'C';
	}

	public Temperature(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}

	public Temperature(char scale) {
		this.scale = scale;
		this.temperature = 0;
	}

	public void setScale(char scale) {
		this.scale = scale;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void setBoth(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}

	public double getCelsius() {
		double celsius = (5 * (this.temperature - 32)) / 9;
		return celsius;
	}

	public double getFahrenheit() {
		double fahrenheit = (9 * (this.temperature / 5) + 32);
		return fahrenheit;
	}

	public char getScale() {
		return this.scale;
	}

}
