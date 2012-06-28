package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAssertions.class, TestBishop.class, TestChessBoard.class,
        TestKing.class, TestKnight.class, TestPawn.class,
        TestQueen.class, TestRook.class})
public class AllTests {

}
