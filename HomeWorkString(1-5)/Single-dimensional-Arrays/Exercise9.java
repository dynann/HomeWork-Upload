//reverse individual string

public class Exercise9 {
    public static void main(String[] args) {

        //create original string, modified string, array string
        StringBuilder s = new StringBuilder("woe.google.com");
        StringBuilder s1 = new StringBuilder();
        String[] arrayString;

        // split the string using a regex pattern that matches any non-letter character as delimiters
        arrayString = s.toString().split("(?=[^a-zA-Z])|(?<=[^a-zA-Z])");
        String[] str = new String[arrayString.length];

        //iterate through each element in split string
        //in order to revers word each element of string
        //by adding to new array string called str
        for (int i = 0; i < arrayString.length; i++) {


                //initialize value to string array
                str[i] = "";
                for (int j = arrayString[i].length() - 1; j >= 0; j--) {

                    str[i] += arrayString[i].charAt(j);
                }
        }

        //modified every letter to string builder
        for (String a : str) {
            s1.append(a);
        }

        //display reversed string
        System.out.println(s1);
    }
}
