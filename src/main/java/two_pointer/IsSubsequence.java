package two_pointer;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.equals(t)) {
            return true;
        }

        if (s.length() >= t.length()) {
            return false;
        }

        if (s.isEmpty()) {
            return true;
        }

        int sIndex = 0;

        for (int i = 0; i < t.length() && sIndex <= s.length() ; i++) {
            if (sIndex == s.length()) {
                break;
            }
            if(s.charAt(sIndex) == t.charAt(i)) {
                sIndex++;
            }
        }
        return (sIndex == s.length());
    }
}
