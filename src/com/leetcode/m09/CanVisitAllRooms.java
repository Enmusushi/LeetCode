package com.leetcode.m09;

import java.util.List;

/**
 * 841. 钥匙和房间
 */
public class CanVisitAllRooms {
    //自己写错了的
    public boolean canVisitAllRoomsFalse(List<List<Integer>> rooms) {
        int len = rooms.size() + 1;
        int[] nums = new int[len];
        int count = 0;
        boolean isGoOn = false;
        for (List<Integer> room : rooms) {
            count++;
            if (count == len - 1) {
                break;
            }
            isGoOn = false;
            for (Integer num : room) {
                nums[num] = num;
            }
            if (count == nums[count]) {
                isGoOn = true;
                continue;
            }
            if (!isGoOn) {
                return false;
            }
        }
        return true;
    }
//別人的
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        canVisitThisRoom(rooms, 0, visited);
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }

    public void canVisitThisRoom(List<List<Integer>> rooms, int index, boolean[] visited) {
        if (visited[index]) {
            return;
        }
        visited[index] = true;
        for (Integer key : rooms.get(index)) {
            canVisitThisRoom(rooms, key, visited);
        }
    }
}
