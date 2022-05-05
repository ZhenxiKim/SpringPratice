package com.example.springpratice;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author jhkim
 * @since 2022/05/05
 */
public class GameTest {
    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void canRoll() {
        game.roll(0);
    }
    private void rollMany(int frames, int pins) {
        for(int i = 0; i < frames; i++)
            game.roll(pins);//핀을 하나도 쓰러뜨리지 않은것
    }

    @Test
    public void gutterGame() {
        //10번의 프레임 중 양옆으로 빠지면 20번까지 게임 참여가능
        rollMany(20, 0);
        assertThat(game.getScore(), is(0));
    }



    @Test
    public void allOnes() {
        //1개의 핀만 쳐서 20점의 점수가 난 상황
        rollMany(1,20);
        assertThat(game.getScore(), is(20));
    }


}
