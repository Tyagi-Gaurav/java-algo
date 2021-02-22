package algo.nonDivisibleSet;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
  If (A+B) is divisible by k, then we could say that the remainder of
 (A/k) + (B/k) should sum to k. And hence A and B should not belong to the
 same group.

 At first, we can scan the array, divide all the elements by k, and group them
 by their remainders.

 Then we scan the sets and take the maximum between two group of remainders that sum
 to k.

 Example, when k = 5,

 We can take max. between 4 & 1
 We can take max. between 2 & 3
 For 0, we can only take 1 element out of the set.
 */
public class NonDivisibleSet {
    public int findLength(int k, List<Integer> S) {
        int maxSubsetSize = 0;

        Map<Integer, Long> collect = S.stream()
                .map(x -> x % k)
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()
                ));

        for (int s = 1, e = k -1; e >= s; e--, s++) {
            if (e != s)
                maxSubsetSize += Math.max(getSize(s, collect), getSize(e, collect));
             else
                maxSubsetSize += Math.min(1, getSize(s, collect));
        }

        if (getSize(0, collect) > 0) maxSubsetSize++;

        return maxSubsetSize;
    }

    private Long getSize(int s, Map<Integer, Long> collect) {
        return collect.getOrDefault(s, 0L);
    }
}
