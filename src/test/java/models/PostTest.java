package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PostTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void newPostObjectGetsCorrectlyCreated_true() throws Exception {
        Post testPost = new Post("Day:1 Intro");
        assertEquals("Day:1 Intro", testPost.getContent());
    }
}