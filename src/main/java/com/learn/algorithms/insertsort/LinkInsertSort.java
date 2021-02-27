package com.learn.algorithms.insertsort;

/**
 * @author wu00y
 */
public class LinkInsertSort {
    public static void main(String[] args) {

    }
    LinkNode sort(LinkNode head){
        if (head == null || head.next == null) {
            return head;
        }

        LinkNode cur = head;
        LinkNode pre = null;
        LinkNode next = head.next;
        return next;
    }

    private class LinkNode {
        public int val;
        public LinkNode next;

        public LinkNode(int val) {
            this.val = val;
        }
    }

    private class LinkList{
        public LinkNode head;
        public LinkNode tail;
        private int size = 0;

        void add(int val){
            if (head == null && size == 0){
                head = new LinkNode(val);
                tail = head;
            }else{
                tail.next = new LinkNode(val);
            }
            ++size;
        }

        private void tailInsert(LinkNode node){
            tail.next = node;
            ++size;
        }
    }

}
