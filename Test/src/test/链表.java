package test;

import java.util.Scanner;

public class 链表 {

	/**
	 * 题目描述 链表 。
	 */
	

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
			//输入节点数
			int nodeNum = sc.nextInt();
			//输入头节点的值
			int headVal = sc.nextInt();
			Node hNode=new Node(headVal);
			for(int i = 0;i < nodeNum - 1;i ++){
				//插入节点值
				int nextVal = sc.nextInt();
				//前一节点值
				int preVal = sc.nextInt();
				//插入节点
				hNode=insert(hNode,preVal,nextVal);
				
			}
			int removeVal = sc.nextInt();
			hNode=remove(hNode,removeVal);
			while(hNode!=null){
				System.out.print(hNode.val+" ");
				hNode=hNode.next;
			}
			/*while(hNode.next != null){
				System.out.print(hNode.val + " ");
				hNode = hNode.next;
			}
			System.out.println(hNode.val + " ");*/
        }
        sc.close();
    }

	private static Node remove(Node hNode, int removeVal) {
		Node p=hNode;
		if(p.val==removeVal){
			hNode=hNode.next;
		}else{
			while(p.next.val!=removeVal){
				p=p.next;
			}
			Node r=p.next;
			p.next=r.next;
			
		}
		
		
		return hNode;
	}

	private static Node insert(Node hNode, int preVal, int nextVal) {
		Node p=hNode;
		while(p.val!=preVal){
			p=p.next;
		}
			Node q=p.next;
			Node c=new Node(nextVal);
			p.next=c;
			c.next=q;
		
		return hNode;
	}

	
}
class Node{
	public int val;
	public Node next;
	public Node(int val){
		this.val=val;
	}
}
