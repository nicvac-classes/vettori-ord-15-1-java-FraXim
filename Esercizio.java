import java.util.Scanner;
import java.util.Random;

public class Esercizio {
    private static Random random = new Random();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;
        System.out.println("Inserisci quante macchine hanno partecipato alla gara: ");
        n = in.nextInt();
        int[] p = new int[n];
        String[] nomi = new String[n];
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Inserisci i nomi delle auto che hanno partecipato: ");
            nomi[i] = in.nextLine();
        }
        impostaVettoreRandom(p, n, nomi);
        bubbleSort(nomi, p, n);
        System.out.println("Ecco l'elenco di tutte le macchine ordinate in base alla classifica ordinata :");
        visualizzaVettori(nomi, p, n);
    }
    
    public static void bubbleSort(String[] nomi, int[] p, int n) {
        int i, j, t;
        String c;
        boolean scambi;
        i = 0;
        scambi = true;
        while (i <= n - 1 && scambi == true) {
            scambi = false;
            j = 0;
            while (j <= n - 2 - i) {
                if (p[j] <= p[j + 1]) {
                    t = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = t;
                    c = nomi[j];
                    nomi[j] = nomi[j + 1];
                    nomi[j + 1] = nomi[j];
                    scambi = true;
                }
                j = j + 1;
            }
            i = i + 1;
        }
    }
    
    public static void impostaVettoreRandom(int[] p, int n, String[] nomi) {
        int i;
        for (i = 0; i <= n - 1; i++) {
            p[i] = random.nextInt(25) + 1;
            System.out.println("Posizione macchina " + nomi[i] + " non ordinata: " + p[i]);
        }
    }
    
    public static void visualizzaVettori(String[] nomi, int[] p, int n) {
        int i;
        for (i = 0; i <= n - 1; i++) {
            System.out.println("La macchina " + nomi[i] + " è arrivato alla " + p[i] + "° posizione.");
        }
    }
}
