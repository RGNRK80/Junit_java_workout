import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class EngineTest {

    Engine engineTest=new Engine();

    @Test
    void testGetTurbo() {
        assertEquals(100,110);
    }

    @ParameterizedTest
    @MethodSource("getTurboDataProvider")
    void testGetTurbo2(int exp,int par1) {
        assertEquals(exp,engineTest.getTurbo(par1));
    }

    static Stream<Arguments> getTurboDataProvider() {
        return Stream.of(
                arguments(110,110),
                arguments(1100,1000)
        );
    }

}