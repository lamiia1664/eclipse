package methodsandconstructor;

public class RectanglesParametarizedConstructor {
	float area;
	
	public RectanglesParametarizedConstructor(float l, float b) {
		area=l*b;
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectanglesParametarizedConstructor ob = new RectanglesParametarizedConstructor(3.5f, 6.3f);

	}

}
