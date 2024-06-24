public class Person {

	private String name; // private = restricted access

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String newName) {
		this.name = newName;
	}

	public static void main(String[] args) {
		Person p = new Person();

		p.setName("Bruh");

		System.out.println(p.getName());
	}
}
