package org.ryuu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ServiceTest {

    @Test
    void foo_ShouldReturn2Times() {
        Service service = mock(Service.class);
        String mockReturnValue = "Mocked Response";
        when(service.foo())
                .thenReturn(mockReturnValue);
        assertEquals(mockReturnValue, service.foo());
        assertEquals(mockReturnValue, service.foo());
        verify(service, times(2))
                .foo();
    }

    @Test
    void bar() {
    }
}