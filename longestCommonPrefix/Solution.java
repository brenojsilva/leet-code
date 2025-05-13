package longestCommonPrefix;

public class Solution {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String palavraAtual = strs[i];

            while (!palavraAtual.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println("Prefixo comum: " + prefix);
    }
}