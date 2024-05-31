import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileRWTest {

    @Test
    void getMaxScore() {

        FileRW fileRW = new FileRW();
        assertEquals(fileRW.getAllScoresArray().get(0),fileRW.getMaxScore());

    }

    @Test
    void removeDuplicates() {

        FileRW fileRW = new FileRW();
        ArrayList<Integer> duplicates = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        duplicates.add(2);
        duplicates.add(2);
        assertArrayEquals(expected.toArray(),fileRW.removeDuplicates(duplicates).toArray());


    }

    @Test
    void first() {

        FileRW fileRW = new FileRW();
        assertEquals("1st: "+fileRW.getMaxScore(),fileRW.first());

    }
}