import org.junit.Test;

import static org.junit.Assert.*;

public class EuroTest {
    @Test
    public void shouldHaveOneEuroBeTheSameAsAnotherEuroWhenTheirValuesAreTheSame() {
        assertEquals(new Euro(1), new Euro(1));
    }
    @Test
    public void shouldHaveOneEuroBeDifferentAsAnotherEuroWhenTheirValuesAreDifferent() {
        assertNotEquals(new Euro(1), new Euro(3));
    }
    @Test
    public void shouldHaveOneEuroBeDifferentAsAnotherEuroWhenTheSecondEuroDoesntExistOrIsNull() {
        assertNotEquals(null, new Euro(1));
    }
    @Test
    public void shouldHaveOneEuroBeDifferentAsAnotherObjectWhenTheSecondObjectIsNotEuro() {
        assertNotEquals(new Integer(1), new Euro(1));
    }
    @Test
    public void shouldHaveOneEuroBeDifferentAsAnotherObjectWhenTheSecondObjectIsAString() {
        assertNotEquals(new String("1"), new Euro(1));
    }
    @Test
    public void shouldHaveOneEuroBeDifferentAsAnotherObjectWhenTheSecondObjectIsAGenaricObject() {
        assertNotEquals(new Euro(1), new Object() );
    }
    @Test
    public void shouldHaveTenEurosBeEqualToSevenEurosPlusThreeEuros() {

        assertEquals(new Euro(10), new Euro(3).add(new Euro(7))) ;
    }
    @Test
    public void shouldHaveTenEurosBeNotEqualToTwoEurosPlusThreeEuros() {

        assertNotEquals(new Euro(10), new Euro(3).add(new Euro(2))) ;
    }
    @Test
    public void shouldNotEqualWhenTenEurosISEquatedToTenDollars() {

        assertNotEquals(new Euro(10),new Dollar(10));

    }

    @Test
    public void shouldBeEqualWhen10EurosIsEquatedToThirteenPointFiveDollars() throws Exception {
        assertEquals(new Euro(10), new Dollar(13.5));

    }
}