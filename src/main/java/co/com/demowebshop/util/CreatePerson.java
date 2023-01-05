package co.com.demowebshop.util;

import co.com.demowebshop.models.Person;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class CreatePerson {
    Faker faker = new Faker();
    FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-GB"), new RandomService());

    public Person createPerson() {
        return new Person(
                faker.dog().gender(),
                faker.name().firstName(),
                faker.name().lastName(),
                fakeValuesService.bothify("????##@gmail.com"),
                fakeValuesService.regexify("[a-z1-9]{10}")
        );
    }
}
