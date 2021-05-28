package ua.matyukhin.hw9;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class ChessTests {
    @Mock
    Converter converterMock;

    @InjectMocks
    Chess chess = new Chess(converterMock);

    @Test
    public void CanMove() {
        Assert.assertTrue(Chess.horseMove("c4", "a3"));
    }
    @Test
    public void CantMove() {
        Assert.assertFalse(Chess.horseMove("f8", "d5"));
    }
}
