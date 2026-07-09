/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() <= 1) {
            return true;
        }

        Map<Integer, Interval> meetings = new TreeMap<>();
        for (Interval interval : intervals) {
            meetings.put(interval.start, interval);
        }

        if (meetings.size() != intervals.size()) {
            return false;
        }

        int prevEnd = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Interval> meeting : meetings.entrySet()) {
            Interval curr = meeting.getValue();
            if (curr.start < prevEnd) {
                return false;
            }
            prevEnd = curr.end;
        }

        return true;
    }
}
