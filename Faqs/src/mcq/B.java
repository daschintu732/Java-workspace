package mcq;
//Class 1
public class B {

	public static void main(String[] args) {

		Mul b = new Mul(2, 2, 3);
		System.out.println(b.getVolume());
	}
}
//Class 2
final class Mul
{
	private int volume;
	
	Mul(int length, int width, int height) {
		this.volume = length * width * height;
	}
	public int getVolume() {
		return volume;
	}
}
