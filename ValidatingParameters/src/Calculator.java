public class Calculator{

    public int factorial (int number){
        if(number < 0){
            throw new IllegalArgumentException(" Invalid. Negative Number");
        }

        return number;
    }

    public int binomialCoefficient(int subset, int setsize){
        if( subset < setsize && subset < 0 || setsize < 0){
            throw new IllegalArgumentException(" Invalid");
        }

        return binomialCoefficient(subset, setsize);
    }
}