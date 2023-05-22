import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFile {
    @Test
    void getValue() {
        assertEquals(1, SourceFile.getValue());
    }
}