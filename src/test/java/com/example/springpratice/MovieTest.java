package com.example.springpratice;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author jhkim
 * @since 2022/05/05
 */
public class MovieTest {

    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie();
    }

    @Test
    public void should_return_0_when_just_create() {
        assertThat(movie.averageRating(), is(0));
    }

    @Test
    public void should_return_1_when_was_rated() {
        movie.rate(1);
        assertThat(movie.averageRating(), is(1));
    }

    @Test
    public void should_return_4_when_3_and_5_were_rated() {
        movie.rate(3);
        movie.rate(5);
        assertThat(movie.averageRating(), is(4));
    }
}
