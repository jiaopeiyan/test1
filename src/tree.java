//import javax.swing.tree.TreeNode;
//
//
//public class tree {
//    public class TreeNode {
//        public int val;
//        public TreeNode left;
//        public TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//
//        public String toString() {
//            return Integer.toString(val);
//        }
//
//        public boolean isSubtree(TreeNode T1, TreeNode T2) {
//            if (T1 == null)
//                return false;
//            return isSubtreeWithRoot(T1, T2) || isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
//
//        }
//
//        private boolean isSubtreeWithRoot(TreeNode T1, TreeNode T2) {
//            if (T1 == null && T2 == null)
//                return true;
//            if (T1 == null || T2 == null)
//                return false;
//            if (T1.val != T2.val)
//                return false;
//            return isSubtreeWithRoot(T1.left, T2.left) && isSubtreeWithRoot(T1.right, T2.right);
//        }
//
//        //判断是不是对称树
//        public boolean isSymmetric(TreeNode root) {
//            if (root == null) {
//                return true;
//            }
//            return isSymmetric(root.left, root.right);
//        }
//
//        private boolean isSymmetric(TreeNode T1, TreeNode T2) {
//            if (T1 == null && T2 == null)
//                return true;
//            if (T1 == null || T2 == null)
//                return false;
//            if (T1.val != T2.val) {
//                return false;
//                return isSymmetric(T1.left, T2.left) && isSymmetric(T1.right, T2.right);
//            }
//        }
//    }