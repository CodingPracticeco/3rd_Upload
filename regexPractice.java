public class regexPractice {
//    https://www.youtube.com/watch?v=3DDLJOExiWM

    public static void main(String[] args) {

        System.out.println("Parenthesis ():");
// Parenthesis ():

        Pattern expressionAsPattern = Pattern.compile("^(a|aa|AA|A)gent \\d{3,4}$");     //() lets you have multiple character long OR's
        Matcher patternCase = expressionAsPattern.matcher("AAgent 1234");
        System.out.println(patternCase.find());


        System.out.println("\nmatcherName.group():");
// matcherName.group():


        expressionAsPattern = Pattern.compile("^[a|A]gent (\\d{3,4})$");
        patternCase = expressionAsPattern.matcher("Agent 0008");


        //Checks if pattern exists so we don't get an error         only works once subsequent if(patternCase.find())  need the Pattern and Matcher
        if (patternCase.find()) {                                    //to be re-established


            System.out.println(patternCase.group(1));       //.group(1) prints out group index 1

        }


        System.out.println("\nmatcherName.replace:");
// matcherName.replace:                             .replaceFirst   .replaceAll

        expressionAsPattern = Pattern.compile("(\\d{4})-(\\d{4})-(\\d{4})-(\\d{4})");
        patternCase = expressionAsPattern.matcher("4132-3452-5234-2390");


        if (patternCase.find()) {
            System.out.println(patternCase.replaceFirst("8000"));       //Replaces first group

            System.out.println(patternCase.replaceAll("0000"));         //replaces everything with just "0000"
        }


        System.out.println("\nmatcherName.group() Example:");
// matcherName.group() Examples:


        String cardNumber = "4132-3452-5234-2390";
        Pattern noHypens3 = Pattern.compile("(\\d{4})-(\\d{4})-(\\d{4})-(\\d{4})");
        Matcher inputCase = noHypens3.matcher(cardNumber);


        if (inputCase.find()) {
            System.out.println(inputCase.group(1));     //Like this we can individually print out whatever groups we want
            System.out.println(inputCase.group(2));
            System.out.println(inputCase.group(3));
            System.out.println(inputCase.group(4));
        }
        System.out.println("\n");






        String mathEquation = "100 divided by 2";
        Pattern format = Pattern.compile("^(\\d+) divided by (\\d+)$");
        Matcher compareCase = format.matcher(mathEquation);



        int result = Integer.valueOf(compareCase.group(1)) / Integer.valueOf(compareCase.group(2)); //Can be used to more easily do math from Strings
        System.out.println(result);



//Quick Notes:
//    * matches zero or more occurrences
//    + matches one or more occurrences
//    ? matches zero or one occurrence
}
