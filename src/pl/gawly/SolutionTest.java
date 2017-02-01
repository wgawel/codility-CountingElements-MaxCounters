package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testOne() {
        Assert.assertTrue(Arrays.equals(new int[]{1}, s.solution(1, new int[]{1})));
    }

    @Test
    public void testEx1() {
        Assert.assertTrue(Arrays.equals(new int[]{3, 2, 2, 4, 2}, s.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
    }
}
