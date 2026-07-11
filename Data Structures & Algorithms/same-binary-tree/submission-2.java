/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1 = toTreeList(p);
        List<Integer> list2 = toTreeList(q);

        if (list1 == null && list2 == null) {
            return true;
        } else if ((list1 == null && list2 != null) || (list2 == null && list1 != null)) {
            return false;
        }

        return list1.equals(list2);
    }

    private List<Integer> toTreeList(TreeNode t) {
        if (t == null) {
            return null;
        }

        List<Integer> treeList = new ArrayList<>();
        treeList.add(t.val);

        if (toTreeList(t.left) != null) {
            treeList.addAll(toTreeList(t.left));
        } else {
            treeList.add(null);
        }

        if (toTreeList(t.right) != null) {
            treeList.addAll(toTreeList(t.right));
        } else {
            treeList.add(null);
        }

        System.out.println(treeList);
        return treeList;
    }
}
