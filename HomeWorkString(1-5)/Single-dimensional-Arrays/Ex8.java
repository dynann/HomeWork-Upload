//locker game

public class Ex8 {
    public static void main(String[] Args) {
        boolean[] lockers = new boolean[51];
        int countLocker = 0;

        //the first player opens every locker
        for(int i = 1 ; i <= 50; i++){
            lockers[i] = true;
        }
        for(int i = 2 ; i <= 50; i++){
            lockers[i] = !lockers[i];
        }


        //the seconde, third, forth player open and close the lockers
        for(int i = 3; i <= 50 ; i++){

            for(int j = 1 ; i * j <= 50; j++){
                lockers[i * j] = !lockers[i * j];
            }

        }

        //display the which number locker is open and total of open lockers
        for(int i = 1; i < lockers.length; i++){
            if(lockers[i]){
                countLocker -=-1;
                System.out.println("The open locker number is : " + i);
            }
        }
      System.out.println("The total locker open is : " + countLocker);
    }
}

