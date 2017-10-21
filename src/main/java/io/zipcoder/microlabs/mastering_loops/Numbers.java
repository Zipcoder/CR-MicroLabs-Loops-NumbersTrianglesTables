package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){
        String oneToTenOutput = "oneToTen()\n*** Output ***\n";
        for (int number = 1; number <= 10; number++) {
            oneToTenOutput += number + "\n";
        }
        oneToTenOutput = oneToTenOutput.trim();
        return oneToTenOutput;
    }

    public String oddNumbers(){
        String oddNumbersOutput = "oddNumbers()\n*** Output ***\n";
        for (int oddNumber = 1; oddNumber < 20; oddNumber += 2) {
            oddNumbersOutput += oddNumber + "\n";
        }
        oddNumbersOutput = oddNumbersOutput.trim();
        return oddNumbersOutput;
    }

    public String squares(){
        String squaresOutput = "squares()\n*** Output ***\n";
        for (int base = 1; base <= 10; base++) {
            squaresOutput += base * base + "\n";
        }
        squaresOutput = squaresOutput.trim();
        return squaresOutput;
    }

    public String random4(){
        String output = "random4()\n*** Output ***\n";
        return output;
    }

    public String even(int n){
        String evenNumbersOutput = "even(" + n + ")\n*** Output ***\n";
        for (int evenNumber = 2; evenNumber < n; evenNumber += 2) {
            evenNumbersOutput += evenNumber + "\n";
        }
        evenNumbersOutput = evenNumbersOutput.trim();
        return evenNumbersOutput;
    }

    public String powers(int n){
        String output = "powers(" + n + ")\n*** Output ***\n";
        for (int exponent = 1; exponent <= n; exponent++) {
            int exponentiation = (int) Math.pow(2, exponent);
            output +=  exponentiation + "\n";
        }
        output = output.trim();
        return output;
    }

}
