import java.util.HashMap;

class romanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMIII"));
    }

    //less optimal
    public static int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int sum =0;
        int previousValue = 0;
        for(char c : s.toCharArray()){
            if(roman.get(c)>previousValue){
                sum = sum + roman.get(c) - 2*previousValue;
            }
            else{
                sum+=roman.get(c);
            }
            previousValue=roman.get(c);
        }
        return sum;
    }
}
