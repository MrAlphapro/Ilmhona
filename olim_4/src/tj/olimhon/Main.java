package tj.olimhon;

public class Main {

    public static void main(String[] args) {
	    int [][] masiv = {
	            {1,2,3,4},
                {5,3,6,4},
                {-1,5,-8,9},
                {1,-4,6,3}};

	    int sum = 0;

	    for (int i = 0; i<masiv.length; i++){
	        for (int j = 0; j< masiv[i].length; j++){
	            sum += masiv[i][j];

            }

        }System.out.println(sum);
    }
}
