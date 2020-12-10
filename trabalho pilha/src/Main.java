import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Array> a = new ObjectStack<>();

        a.push(new Array(1, "Junior", 21));
        a.push(new Array(2, "Edson", 47));
        a.push(new Array(3, "Debora", 45));

        try { // tente
            System.out.println(a.pop());
            System.out.println(a.pop());
            System.out.println(a.pop());
            // Erro! fila vazia
            System.out.println(a.pop());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Fim do programa!");
    }
}