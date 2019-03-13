package test2;
public class PreMidToAfter {
	public static int index = 0; // 记录从前序序列遍历的位置
 
	/**
	 * 二叉树的节点的数据结构类
	 * 
	 * @author mzdong
	 * 
	 */
	private class Node {
		Node leftChild;
		Node rightChild;
		int data;
 
		public Node(int data) {
			leftChild = null;
			rightChild = null;
			this.data = data;
		}
	}
 
	/**
	 * 后序遍历
	 * 
	 * @param node
	 */
	public void afterOrder(Node node) {
		if (node != null) {
			afterOrder(node.leftChild);
			afterOrder(node.rightChild);
			System.out.print(node.data + " ");
		}
	}
 
	/**
	 * 已知前序和中序序列，求后序序列。
	 * 
	 * @param pre
	 * @param mid
	 * @param midStart
	 * @param midEnd
	 * @return 最终返回根节点
	 */
	public Node process(int[] pre, int[] mid, int midStart, int midEnd) {
		int mstart = midStart;
		int mend = midEnd;
		int flag = 0;
		if (index >= pre.length) {
			return null;
		}
		Node node = new Node(pre[index]);
		for (int i = mstart; i <= mend; i++) {//遍历
			if (mid[i] == pre[index]) {
				flag = i;
			}
		}
		index++;
		if (mstart < flag)
			node.leftChild = process(pre, mid, mstart, flag - 1);//是不是有点像快速排序呢。。。
		if (flag < mend)
			node.rightChild = process(pre, mid, flag + 1, mend);
		return node;
	}
 
	public static void main(String[] args) {
		int[] pre = { 1, 5, 6, 10, 7, 2, 9, 3, 4, 8 };// 前序
		int[] mid = { 6, 10, 5, 7, 1, 9, 2, 4, 3, 8 };// 中序
		//int[] after = { 10, 6, 7, 5, 9, 4, 8, 3, 2, 1 };// 后序
		/* int[] pre = {1,2,4,3};//前序
		 int[] mid = {2,4,1,3};//中序
		 int[] after = {4,2,3,1};//后序
*/		PreMidToAfter pmta = new PreMidToAfter();
		Node root = pmta.process(pre, mid, 0, mid.length - 1);
		pmta.afterOrder(root);
 
	}
}