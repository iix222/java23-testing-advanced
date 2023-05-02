package com.st.java23testingadvanced;

import com.st.java23testingadvanced.utils.UserValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class UserValidatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Tony12345", "Hawks12345", "Mark2213", "23421455142", "adsfset524tg"})
    public void givenUserPasssword_whenEncodePasswordCalled_shouldReturnEncodedPassword(String password) {
        String expectedValue = password.substring(0, password.length() / 2) + "#sda_java#" + password.substring(password.length() / 2);
        Assertions.assertEquals(expectedValue, new UserValidator().encodePassword(password));

    }

    @ParameterizedTest
    @MethodSource("getPasswords")
    public void givenUserPassword_whenEncodePasswordCalled_shouldReturnEncodedPassword(String password) {
        String expectedValue = password.substring(0, password.length() / 2) + "#sda_java#" + password.substring(password.length() / 2);
        Assertions.assertEquals(expectedValue, new UserValidator().encodePassword(password));
    }





    //For Method Source
    static Stream<Arguments> getPasswords() {
        return Stream.of(Arguments.of("asfijdhiuagaes"), Arguments.of("325253jh5213jh"),
                Arguments.of("2354hjuufds"), Arguments.of("sdfgsgy45y45"));
    }
}
