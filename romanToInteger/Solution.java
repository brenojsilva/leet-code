package romanToInteger;
import java.util.ArrayList;

class Solution {

    public int romanToInt(String s) {
        ArrayList<Character> romanos = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            romanos.add(s.charAt(i));
        }

        for (int i = 0; i < romanos.size(); i++) {
            char c = romanos.get(i);
            if (c == 'I') {
                numeros.add(1);
            } else if (c == 'V') {
                numeros.add(5);
            } else if (c == 'X') {
                numeros.add(10);
            } else if (c == 'L') {
                numeros.add(50);
            } else if (c == 'C') {
                numeros.add(100);
            } else if (c == 'D') {
                numeros.add(500);
            } else if (c == 'M') {
                numeros.add(1000);
            }
        }

        int soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (i < numeros.size() - 1 && numeros.get(i) < numeros.get(i + 1)) {
                soma -= numeros.get(i);
            } else {
                soma += numeros.get(i);
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        String romanos = "LVIII"; // Deve retornar 58
        Solution solution = new Solution();
        int result = solution.romanToInt(romanos);
        System.out.println(result);
    }
}


// Melhor forma :

//import java.util.HashMap;
// import java.util.Map;

// public class Solution {

//     public int romanToInt(String s) {
//         Map<Character, Integer> mapa = new HashMap<>();
//         mapa.put('I', 1);
//         mapa.put('V', 5);
//         mapa.put('X', 10);
//         mapa.put('L', 50);
//         mapa.put('C', 100);
//         mapa.put('D', 500);
//         mapa.put('M', 1000);

//         int soma = 0;
//         for (int i = 0; i < s.length(); i++) {
//             int atual = mapa.get(s.charAt(i));

//             if (i < s.length() - 1 && atual < mapa.get(s.charAt(i + 1))) {
//                 // Regra de subtração
//                 soma -= atual;
//             } else {
//                 soma += atual;
//             }
//         }
//         return soma;
//     }

//     public static void main(String[] args) {
//         String romanos = "LVIII"; // Deve retornar 58
//         Solution solution = new Solution();
//         int result = solution.romanToInt(romanos);
//         System.out.println("The integer value of " + romanos + " is: " + result);
//     }
// }