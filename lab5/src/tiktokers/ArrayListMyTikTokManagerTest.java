package tiktokers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayListMyTikTokManagerTest {

    private MyTikTokManager dir;
    private MyTikTokManager topTen;

    @Before
    public void setUp() {
        dir = new ArrayListMyTikTokManager();

        topTen = new ArrayListMyTikTokManager();
        topTen.load("src/Top10TikTokers.txt");
    }

    @Test
    public void topTenContainsBurak() {
        assertNotNull(
            topTen.get("@cznburak", "Followers")
        );
    }

    @Test
    public void anEmptyDirectoryHasNoRumpledeater() {
        assertNull(
            dir.get("@rumpledeater", "Followers")
        );
    }

    @Test
    public void basicRemove() {
        dir.put("@testuser", "Followers", "100");

        assertEquals(
            "100",
            dir.remove("@testuser", "Followers")
        );

        assertNull(
            dir.get("@testuser", "Followers")
        );
    }

    @Test
    public void removeNonExistentEntryEmptyManager() {
        assertNull(
            dir.remove("@missinguser", "Followers")
        );
    }

    @Test
    public void removeNonExistentEntryNonEmptyManager() {
        dir.put("@existinguser", "Followers", "100");

        assertNull(
            dir.remove("@missinguser", "Followers")
        );
    }
}