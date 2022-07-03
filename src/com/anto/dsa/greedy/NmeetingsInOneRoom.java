package com.anto.dsa.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * see <a href=
 * "https://takeuforward.org/data-structure/n-meetings-in-one-room/">n-meetings-in-one-room<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class NmeetingsInOneRoom {
    public static void main(String args[]) {
        int n = 6;
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 5, 7, 9, 9 };
        maxMeetings(start, end, n);

    }

    public static void maxMeetings(int[] start, int[] end, int n) {

        // create meeting object with start, end and meeting number
        List<Meeting> meetings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(start[i], end[i], i + 1));
        }

        // sort the meeting with meeting end value
        meetings.sort(Comparator.comparing(Meeting::getEnd).thenComparing(Meeting::getPos));

        List<Integer> result = new ArrayList<>();
        int limit = -1;

        // compare the meeting start time with last end time
        for (Meeting m : meetings) {
            if (m.start > limit) {
                result.add(m.pos);
                limit = m.end;
            }
        }

        System.out.println(result);

    }
}

class Meeting {
    int start;
    int end;
    int pos;

    public Meeting(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }

    public int getEnd() {
        return end;
    }

    public int getPos() {
        return pos;
    }

}