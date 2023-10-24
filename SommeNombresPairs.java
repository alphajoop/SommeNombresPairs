import java.util.Scanner;

public class SommeNombresPairs {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Demandez à l'utilisateur de saisir la borne inférieure de la plage.
      System.out.print("Entrez la borne inférieure : ");
      int borneInferieure = scanner.nextInt();

      // Demandez à l'utilisateur de saisir la borne supérieure de la plage.
      System.out.print("Entrez la borne supérieure : ");
      int borneSuperieure = scanner.nextInt();

      // Assurez-vous que la borne supérieure est supérieure à la borne inférieure.
      if (borneSuperieure <= borneInferieure) {
        System.out.println(
          "La borne supérieure doit être supérieure à la borne inférieure."
        );
        return;
      }

      int somme = 0;

      // Parcourez la plage et ajoutez les nombres pairs à la somme.
      for (int nombre = borneInferieure; nombre <= borneSuperieure; nombre++) {
        if (nombre % 2 == 0) {
          somme += nombre;
        }
      }

      // Affichez le résultat.
      System.out.println(
        "La somme des nombres pairs dans la plage de " +
        borneInferieure +
        " à " +
        borneSuperieure +
        " est : " +
        somme
      );
    }
  }
}
