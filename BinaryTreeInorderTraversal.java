
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        if (root == null){
            return list;
        }

        //list.add(inorderTraversal(root.left));

        for (int i : inorderTraversal(root.left)){
            list.add(i);
        }

        list.add(root.val);
        System.out.print(root.val + " ");
        for (int i : inorderTraversal(root.right)){
            list.add(i);
        }
        //list.add(inorderTraversal(root.right));

        return list;
    }
}
