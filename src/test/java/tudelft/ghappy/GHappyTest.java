package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    private GHappy gHappy;

    @BeforeEach
    public void initialize() {
        this.gHappy = new GHappy();
    }

    @ParameterizedTest(name = "gIsHappy")
    @CsvSource({"ggxxxx", "xxggxx", "xxxxgg", "xxggggxx"})
    public void gIsHappy(String gHappyStr) {
        Assertions.assertTrue(gHappy.gHappy(gHappyStr), "String '" + gHappyStr + "' makes G sad.");
    }

    @ParameterizedTest(name = "gIsNotHappy")
    @CsvSource({"xxgxx", "xxggyygxx", "gxxxx", "xxxxg"})
    public void gIsNotHappy(String gHappyStr) {
        Assertions.assertFalse(gHappy.gHappy(gHappyStr), "String '" + gHappyStr + "' makes G happy when it should be sad.");
    }

}
