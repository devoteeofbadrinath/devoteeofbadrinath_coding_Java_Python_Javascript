package Day1.Java.DynamicProgramming.LCS;

public class LCS {

    public static void main(String[] args) {
        LCS lcs = new LCS();
        System.out.println(lcs.lcs(0, 0, "ABCDEFGHIJKL", "DEFGHIJKL", 0));
    }

    int lcs(int i, int j, String s1, String s2, int subSequenceLength) {
        if (i == s1.length() || j == s2.length()) {
            return subSequenceLength;
        } else if (s1.charAt(i) == s2.charAt(j)) {
            return lcs(i + 1, j + 1, s1, s2, subSequenceLength + 1);
        } else {
            return Math.max(lcs(i + 1, j, s1, s2, subSequenceLength),
                    lcs(i, j + 1, s1, s2, subSequenceLength));
        }
    }

}
