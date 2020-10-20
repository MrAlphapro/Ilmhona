package tj.olimhon;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static void main(String[] args) {
        int[] masiv = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < masiv.length; i++) {
            sum += masiv[i];
        }
        System.out.println(sum);

    }
}
