package com.company.solution.week09.bbahngju;

import com.company.common.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//102
//O(NlogN)
public class BinaryTreeLevelOrderTraversal {
    private static int uid = 0;
    public class Info {
        int idx;
        int value;
        int uid;

        public Info(int i, int v, int uid) {
            this.idx = i;
            this.value = v;
            this.uid = uid;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        PriorityQueue<Info> search = new PriorityQueue<>(new Comparator<Info>() {
            @Override
            public int compare(Info o1, Info o2) {
                if (o1.idx != o2.idx)
                    return o1.idx - o2.idx;
                return o1.uid - o2.uid;
            }
        });

        if(root == null) return answer;

        searchLevel(root, 0, search);

        int idx;
        List<Integer> tmp = new ArrayList<>();
        Info info = search.poll();
        idx = info.idx;
        tmp.add(info.value);
        while(!search.isEmpty()) {
            info = search.poll();
            if(idx != info.idx) {
                answer.add(new ArrayList<>(tmp));
                tmp = new ArrayList<>();
                idx = info.idx;
            }

            tmp.add(info.value);
        }

        answer.add(new ArrayList<>(tmp));
        return answer;
    }

    public void searchLevel(TreeNode root, int cnt, PriorityQueue<Info> search) {
        search.add(new Info(cnt, root.val, uid++));
        if(root.left != null) {
            searchLevel(root.left, cnt+1, search);
        }
        if(root.right != null) {
            searchLevel(root.right, cnt+1, search);
        }
    }
}
