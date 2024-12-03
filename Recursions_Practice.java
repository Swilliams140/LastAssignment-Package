public class Recursions_Practice {
    public String displayString(String str, int n){
        if(n == 0){
            return "";
        }
        return str + displayString(str,n-1);
    }
    public String getMultiChar(char ch, int n){
        if(n == 0){
            return String.valueOf(ch);
        }
        return ch + getMultiChar(ch, n-1);
    }
    public int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public int numberOfGloves(int peopleOfPlanetU101InARoom){
        if(peopleOfPlanetU101InARoom == 0){
            return 0;
        }
        return 3 + numberOfGloves(peopleOfPlanetU101InARoom-1);
    }
    public long getPowerOfTen(int n){
        if (n == 0){
            return 1;
        }
        return 10 * getPowerOfTen(n-1);
    }





}
