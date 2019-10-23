package exercise2;

class Person {

	int age;
	String nom;
	static int taillePopulation = 0;
	static float ageTotal = 0;

	static int computePopulationSize() {
		taillePopulation++;
		return taillePopulation;
	}

	static float computeAveragePopulationAge(int age) {
		ageTotal = ageTotal + age;
		float moyenne = ageTotal / taillePopulation;
		System.out.println("\nMoyenne d'âge : " + moyenne);
		return moyenne;
	}

	static void resetPopulation() {
		taillePopulation = 0;
	}
}
