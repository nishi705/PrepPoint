package main.Advance.Arrays;
/*
Problem Description
You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this new interval into the set of intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.



Problem Constraints
0 <= |intervals| <= 105



Input Format
First argument is the vector of intervals

second argument is the new interval to be merged



Output Format
Return the vector of intervals after merging



Example Input
Input 1:

Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
Input 2:

Given intervals [1, 3], [6, 9] insert and merge [2, 6] .


Example Output
Output 1:

 [ [1, 5], [6, 9] ]
Output 2:

 [ [1, 9] ]


Example Explanation
Explanation 1:

(2,5) does not completely merge the given intervals
Explanation 2:

(2,6) completely merges the given intervals

 */
public class Merge_Intervals {
}
/*
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }

public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        ArrayList<Interval> result = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.end < newInterval.start) {
                result.add(interval);
            } else if (newInterval.end < interval.start) {
                result.add(newInterval);
                result.addAll(intervals.subList(i, intervals.size()));
                return result;
            } else {
                int start = Math.min(newInterval.start, interval.start);
                int end = Math.max(newInterval.end, interval.end);
                newInterval.start = start;
                newInterval.end = end;
            }
        }

        result.add(newInterval);

        return result;




    }
}

 */