
class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int length = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '(') {
                length += 2;

                if (length % 2 != 0) {
                    ans++;
                    length--;
                }
            }
            else {
                length--;

                if (length < 0) {
                    ans++;
                    length = 1;
                }
            }
        }

        return ans + length;
    }
}
