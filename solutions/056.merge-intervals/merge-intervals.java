/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    // public List<Interval> merge(List<Interval> intervals) {
    //     if(intervals == null || intervals.size() <= 1) return intervals;
    //     Collections.sort(intervals, (a, b) -> a.start - b.start);
    //     Interval preInterval = intervals.get(0), curInterval;
    //     for(int i = 1; i < intervals.size(); i++) {
    //         curInterval = intervals.get(i);
    //         if(curInterval.start <= preInterval.end) {
    //             preInterval.end = Math.max(preInterval.end, curInterval.end);
    //             intervals.remove(curInterval);
    //             i--;
    //         } else {
    //             preInterval = curInterval;
    //         }
    //     }
    //     return intervals;
    // }
    /**
     * 扫描线法
     */
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.size() <= 1) return intervals;
        Collections.sort(intervals, (a, b) -> a.start - b.start);
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        List<Interval> res = new ArrayList<>();
        for(Interval interval : intervals) {
            if(interval.start <= end) {
                end = Math.max(end, interval.end);
            } else {
                res.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        res.add(new Interval(start, end));
        return res;
    }
}