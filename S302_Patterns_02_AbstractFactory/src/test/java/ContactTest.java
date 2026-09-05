import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void testSpainToStringOutputMustMatchExpected() {
        ContactFactory spainFactory = new SpainContactFactory("Carrer Major 34", "Barcelona", "08001", "623456789");
        Contact contactSpain = new Contact(spainFactory);

        String expectedSpainOutput = "Address: Carrer Major 34, 08001 Barcelona | Phone: +34 623 45 67 89";
        assertEquals(expectedSpainOutput, contactSpain.toString());
    }

    @Test
    void testUSAToStringOutputMustMatchExpected(){
        ContactFactory usaFactory = new USAContactFactory("154 5th Avenue", "New York", "NY 10001", "987654321");
        Contact contactUSA = new Contact(usaFactory);

        String expectedUSAOutput = "Address: 154 5th Avenue, New York, NY 10001 | Phone: +1 (098) 765-4321";
        assertEquals(expectedUSAOutput, contactUSA.toString());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "null, Barcelona, 08001, 623456789",
            ", Barcelona, 08001, 623456789",
            "Carrer Major 34, null, 08001, 623456789",
            "Carrer Major 34,, 08001, 623456789",
            "Carrer Major 34, Barcelona, null, 623456789",
            "Carrer Major 34, Barcelona,, 623456789",
            "Carrer Major 34, Barcelona, 0802, 623456789",
            "Carrer Major 34, Barcelona, 08001, null",
            "Carrer Major 34, Barcelona, 08001,",
            "Carrer Major 34, Barcelona, 08001, 62345678"
    }, nullValues = {"null"})
    void constructSpainContactWithIncorrectInputsShouldReturnException(String street, String city, String postCode, String phone){
        assertThrows(IllegalArgumentException.class, ()-> {
            ContactFactory spanishContactFactory01 = new SpainContactFactory(street, city, postCode, phone);
            new Contact(spanishContactFactory01);
        });

        assertDoesNotThrow(()-> {ContactFactory spanishContactFactory02 = new SpainContactFactory("Carrer Major 34", "Barcelona", "08001", "623456789");});
    }

    @ParameterizedTest
    @CsvSource(value = {
            "null, New York, NY 10001, 987654321",
            ", New York, NY 10001, 987654321",
            "154 5th Avenue, null, NY 10001, 987654321",
            "154 5th Avenue,, NY 10001, 987654321",
            "154 5th Avenue, New York, null, 987654321",
            "154 5th Avenue, New York,, 987654321",
            "154 5th Avenue, New York, NY 1002, 987654321",
            "154 5th Avenue, New York, NY 10001, null",
            "154 5th Avenue, New York, NY 10001,",
            "154 5th Avenue, New York, NY 10001, 98765434"
    }, nullValues = {"null"})
    void constructUSAContactWithIncorrectInputsShouldReturnException(String street, String city, String postCode, String phone){

        assertThrows(IllegalArgumentException.class, ()-> {
            USAContactFactory usaContactFactory = new USAContactFactory(street, city, postCode, phone);
            new Contact(usaContactFactory);
        });

    }
}