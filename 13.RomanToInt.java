
class Solution {
    public int romanToInt(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int value1 = number(s.charAt(i));

            if (i + 1 < s.length()) {
                int value2 = number(s.charAt(i + 1));

                if (value1 >= value2) {
                    sum += value1;
                } else {
                    sum += value2 - value1;
                    i++;
                }
            } else
                sum += value1;

        }
        return sum;
    }

    public int number(char r) {

        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

}
