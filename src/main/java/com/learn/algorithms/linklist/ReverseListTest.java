package com.learn.algorithms.linklist;

/**
 * @author jingjing.zhang
 */
public class ReverseListTest {
    /**
     * 反转链表
     * 描述:
     * 传入头指节点 ,修改节点指向时 需要保存上个节点跟后续节点 ,否则修改操作后容易断链
     * @param head
     * @return
     */
    private static ListNode reverse(ListNode head){
        /**当前节点*/
        ListNode current = head;
        /**上个节点*/
        ListNode prev = null;
        /**循环取节点,循环结束条件 当前节点为空时,表示已经到最后的节点了*/
        while(current != null){
            /**保存下个节点,防止断链*/
            ListNode nextTemp = current.next;
            /**将当前节点的后继指向修改为上个节点,开始反转处理*/
            current.next = prev;
            /**当前节点赋值给上个节点,node为val跟next两个值,所以把节点进行赋值变更,当前节点变成前节点*/
            prev = current;
            /**指针向后指向下个节点继续处理*/
            current = nextTemp;
        }
        /**最后返回处理完成的头节点*/
        return prev;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        node1.val=1;
        node1.next = node2;
        node2.val=2;
        node2.next = node3;
        node3.val=3;
        node3.next=null;
        ListNode result =reverse(node1);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
