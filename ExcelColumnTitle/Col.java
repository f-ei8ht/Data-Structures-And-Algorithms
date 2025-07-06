public class Col {
    public int titleToNumber(String columnTitle) {
        StringBuilder st = new StringBuilder(columnTitle);
        int sum = 0;
        int count = 0;
        st.reverse();
        for (int i = 0; i < st.length(); i++) {
            sum = (int) (sum + (Math.pow(26, count++) * (st.charAt(i) - 'A' + 1)));
        }
        return sum;
    }
}