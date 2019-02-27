package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessengerServiceTest {

    @Test
    void initials() {
        {
            MessengerService service = new MessengerService();
            String actual = service.initials("Vasiliy Ivanov");
            String expendet = "VI";

            assertEquals(expendet, actual);

        }
    }
}