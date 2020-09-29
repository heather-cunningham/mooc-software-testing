package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    private GHappy gHappy;

    @BeforeEach
    public void initialize() {
        this.gHappy = new GHappy();
    }

    @Test
    public void gIsHappy() {
        String gHappyStr = "xxggxx";
        Assertions.assertTrue(gHappy.gHappy(gHappyStr));
    }

    @ParameterizedTest   //(name = "gHappyStr={xxgxx}, gHappyStr={xxggyygxx}")
    @CsvSource({"xxgxx", "xxggyygxx"})
    public void gIsNotHappy(String gHappyStr) {
        Assertions.assertFalse(gHappy.gHappy(gHappyStr), "String '" + gHappyStr + "' makes G not happy.");
    }

}
