package exercise1;

class Person {
	private int age;
	private String name;

	public Person(String nom, int age) {
		this.name = nom;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age){this.age = age;}

	public void setName(String name){this.name = name;}
}
