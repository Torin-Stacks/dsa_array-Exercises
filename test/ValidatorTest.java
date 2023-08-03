import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ValidatorTest {

    Validator obj = new Validator();

    @Test
    public void testObjectExists(){
        assertNotNull(obj);
    }

    @Test
    public void lengthMustBeBetween13And16Test(){
        String cardNo = "2345678725366";
        String validatedNumber = obj.validateLength(cardNo);
        assertEquals(cardNo,validatedNumber);
    }

    @Test
    public void cardNoMustStartWithParticularDigit(){
        String cardNo = "3745678725366";
        obj.validateLength(cardNo);
        char digit = cardNo.charAt(0);
        String response = obj.validateFirstDigit(cardNo);
        assertEquals("Card Type: AmericaExpress", response);

}

    @Test
    public void doubleEverSecondDigitFromRightToLeftTest(){
        String cardNo = "3745678725366";
        obj.validateLength(cardNo);
       int[]arr = obj.doubleEverySecondDigit(cardNo);
       for(int index = 0; index < arr.length; index++){
           assertEquals(12, arr[arr.length - 2]);
       }

    }


    @Test
    public void addEverySecondDigitThatIsADoubleDigitFromRightToLeftTest(){
        String cardNo = "3745678725366";
        obj.validateLength(cardNo);
        int[]arr = obj.doubleEverySecondDigit(cardNo);
        obj.addDoubleDigits(arr);
        for(int index = arr.length-2; index >=0 ; index-=2){
            assertEquals(3, arr[arr.length - 2]);
        }

    }


    @Test
    public void addEverySecondDigitThatIsSingleDigitFromRightToLeftTest(){
        String cardNo = "3745678725366";
        obj.validateLength(cardNo);
        int[]arr = obj.doubleEverySecondDigit(cardNo);
        obj.addDoubleDigits(arr);
        int total=0;
        for(int index = arr.length-2; index >=0 ; index-=2) {
            total = total+arr[index];
        }
        int total2 = obj.addEverySecondDigitThatIsASingleDigit(arr);
        assertEquals(total, total2);
        }


    @Test
    public void addEverySecondDigitFromInitialArrayFromRightToLeftTest(){
        String cardNo = "3745678725366";
        obj.validateLength(cardNo);
        int[]arr = obj.doubleEverySecondDigit(cardNo);
        int total=0;
        for(int index = arr.length-1; index >=0 ; index-=2) {
            total = total+arr[index];
        }
        int total2 = obj.addEverySecondDigitFromInitialArray(arr);
        assertEquals(total, total2);
    }


    @Test
    public void cardValidityTest(){
        String cardNo = "4388576018402626";
        obj.validateLength(cardNo);
        int[]arr = obj.doubleEverySecondDigit(cardNo);
        obj.addDoubleDigits(arr);
        obj.addEverySecondDigitThatIsASingleDigit(arr);
        obj.addEverySecondDigitFromInitialArray(arr);
        String resp = obj.cardValidity(arr);
        assertEquals("invalid card", resp);

    }










}
