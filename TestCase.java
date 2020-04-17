import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestCase{
  @Test
  public void TestCase1(){
    var input = new int [][]{{1}};
    var expected = Arrays.asList(1);
    var actual = SpiralTraveser.spiralTraverse(input);
    assertTrue(expected.equals(actual));
  }
  @Test
  public void TestCase2(){
    var input = new int [][]{{1 , 2},{4,3}};
    List<Integer> expected = Arrays.asList(1,2,3,4);
    List<Integer> actual = SpiralTraveser.spiralTraverse(input);
    assertTrue(expected.equals(actual));
  }
  @Test
  public void TestCase3(){
    var  input = new int [][]{
      {1 , 2 , 3 },
      {8 , 9 , 4 },
      {7 , 6 , 5 }};
    List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9);
    List<Integer> actual = SpiralTraveser.spiralTraverse(input);
    assertTrue(expected.equals(actual));
  }

}
