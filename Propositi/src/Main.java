import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> propositi = new ArrayList<>(); // creiamo un arraylist con i nostri propositi
		propositi.add("Imparare una lingua");
		propositi.add("Imparare uno strumento");
		propositi.add("Esercitarsi sulla OOP");
		propositi.add("Fare più attività fisica");
		propositi.add("Mangiare sano");

		Scanner sc = new Scanner(System.in);

		System.out.println("Buoni propositi per il futuro:"); // fuori dal loop per non dover rileggere il titolo ogni
																// qual volta si consegua un proposito

		while (!propositi.isEmpty()) {
			for (int i = 0; i < propositi.size(); i++) {
				System.out.println((i + 1) + " - " + propositi.get(i)); // impostiamo i buoni propositi come un'ordered
																		// list per selezionare facilmente il proposito
																		// da eliminare
			}
			System.out.println("\nQuale dei propositi hai conseguito?");
			int indice = sc.nextInt() - 1; // in modo che i numeri a schermo, che partono da uno, combacino con
											// l'arraylist, che parte da 0, sottraiamo uno allo scanner
			if (indice >= 0 && indice <= propositi.size()) {
				System.out.println("\nProposito [" + propositi.get(indice) + "] completato.\n");
				propositi.remove(indice);
			} else {
				System.out.println("Numero non valido, riprova.");
			}
		}
		System.out.println("\nComplimenti!");
		sc.close();
	}
}
