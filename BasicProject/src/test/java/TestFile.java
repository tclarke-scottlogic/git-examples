import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFile {
    @Test
    void getVersion() {
        assertEquals(1, SourceFile.getVersion());
    }
}