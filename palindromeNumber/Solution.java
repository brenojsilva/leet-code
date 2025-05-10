package palindromeNumber;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        ArrayList<Integer> digitos = new ArrayList<>();
        
        while (x > 0) {
            int digito = x % 10;
            digitos.add(digito);
            x /= 10;
        }
        
        ArrayList<Integer> reverso = new ArrayList<>(digitos);
        Collections.reverse(reverso);

        return digitos.equals(reverso);
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 10;

        boolean resultado = solution.isPalindrome(x);
        System.out.println(resultado);
    }
}


// Melhor solução:

// class Solution {
//     public boolean isPalindrome(int x) {
//         // Verifica se o número é negativo ou é um múltiplo de 10 (exceto 0).
//         // Se for, o número não pode ser um palíndromo.
//         if (x < 0 || (x != 0 && x % 10 == 0)) return false;

//         // Inicializa a variável check que irá armazenar a metade reversa do número.
//         int check = 0;

//         // Enquanto x for maior que check, o loop continuará invertendo a metade de x.
//         while (x > check) {
//             // Adiciona o último dígito de x ao check (formando a metade reversa).
//             check = check * 10 + x % 10;
//             // Remove o último dígito de x.
//             x /= 10;
//         }

//         // Se x for igual a check, significa que o número tem um número par de dígitos
//         // e é um palíndromo. Ou, se x for igual a check/10, significa que o número tem
//         // um número ímpar de dígitos e o dígito do meio foi descartado corretamente.
//         return (x == check || x == check / 10);
//     }
// }