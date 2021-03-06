package com.nklkarthi.lombok;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FarewellServiceTest {

    private final static String TRANSLATED = "TRANSLATED";

    @Test
    public void sayByeWithTranslatedMessage() {
        Translator translator = mock(Translator.class);
        when(translator.translate("bye")).thenReturn(TRANSLATED);
        FarewellService farewellService = new FarewellService(translator);
        assertEquals(TRANSLATED, farewellService.farewell());
    }
}