public class Ex1 {
    public static void main(String[] args) {

        //initialize string object
        String string = new String("Who are Yoz");

        //object refers to converted string
        String convert = new String();

        //convert string to char array
        char[] chars = string.toCharArray();

        //iterate through string as char array
        for (int i = 0; i < chars.length; i++) {

            //check if blank space skip
            if (chars[i] != ' ') {

               //if character is already z or Z unchage
                if (chars[i] == 'z' || chars[i] == 'Z') {
                    convert += chars[i];

                } else {
                    //convert an alphabet to its next alphabet
                    char c = (char) (chars[i] + 1);

                    //add each character to new string
                    convert += Character.toString(c);
                }

            } else convert += ' '; //add space to its place

        }

        System.out.println(convert);
    }
}