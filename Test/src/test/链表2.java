package test;

import java.util.Scanner;

public class 链表2 {

	/**
	 * 题目描述 链表 。
	 */
	

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
			//输入节点数
			int nodeNum = sc.nextInt();
			int preVal = sc.nextInt();
			Node hNode=new Node(preVal);
			for(int i = 0;i < nodeNum-1 ;i ++){								
				int nextVal = sc.nextInt();
				//插入节点
				hNode=insert(hNode,nextVal);
				
			}
			int index = sc.nextInt();
			int rs=remove(nodeNum,hNode,index);
			System.out.println(rs);
        }
        sc.close();
    }

	private static int remove(int nodeNum,Node hNode, int index) {
		Node p=hNode;
		int rs=0;
		if(index==0){
			
		}else{
			for(int i=0;i<nodeNum-index;i++){		
				p=p.next;
			}
			rs=p.val;
		}
		
		
		return rs;
	}

	private static Node insert(Node hNode,  int nextVal) {
			Node p=hNode;
			while(p.next!=null){
				p=p.next;
			}			
			Node q=p.next;
			Node c=new Node(nextVal);
			p.next=c;
			c.next=q;
		
		return hNode;
	}

	
}


