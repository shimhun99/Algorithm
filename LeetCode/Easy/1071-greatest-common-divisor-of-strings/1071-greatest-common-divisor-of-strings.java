class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // 최대공약수를 찾는다 -> 여기서 최대공약수라고 함은, 나눠질 수 있는 최대 길이를 말함
        
        // GCD는 str1, str2 둘다 완전히 나누어 떨어지는 수이므로, str1 + str2 == str2 + str1 이어야 함
        if(!(str1+str2).equals(str2+str1)) return "";

        // str1을 기준으로 잡고 나눌 문자열을 생성
        int len = gcd(str1.length(), str2.length());

        return str1.substring(0, len);
    }

    private int gcd(int a, int b){
        while(b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }

        return a;
    }
}