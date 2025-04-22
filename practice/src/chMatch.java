public class chMatch {
    public boolean bfMatchword(String text,String pattern){
        int n = text.length();
        int m = pattern.length();
        int isMatch = 0;
        int i,j;
        int index = 0;
        for(i = 0;i < n-m;i++){
            for(j = 0;j < m;j++) {
                if (Math.abs(text.charAt(i + j) - pattern.charAt(j)) != 32) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }
            }
            if(j == m){
                isMatch = 1;
                index = i + j;
                break;
            }
        }
        if(isMatch == 1){
            return text.charAt(index) == ' ' || text.charAt(index) == '.';
        }
        return false;
    }
}
