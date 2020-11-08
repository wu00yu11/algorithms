##1. 时间复杂度
![时间复杂度](doc/img/timeComplexityChart.jpg)
##2. 基本数据结构
###2.1. 冒泡排序
###2.2. 选择排序
###2.3. 插入排序
描述:

插入排序，一般也被称为直接插入排序。对于少量元素的排序，它是一个有效的算法 [1]  。插入排序是一种最简单的排序方法，它的基本思想是将一个记录插入到已经排好序的有序表中，从而一个新的、记录数增1的有序表。在其实现过程使用双层循环，外层循环对除了第一个元素之外的所有元素，内层循环对当前元素前面有序表进行待插入位置查找，并进行移动 [2]  。
解题思路:
![Insertsort](doc/img/insertsort.png)

**1.反转链表**

假设存在链表 1 → 2 → 3 → Ø，我们想要把它改成 Ø ← 1 ← 2
← 3。 

**迭代**

在遍历列表时，将当前节点的 next
指针改为指向前一个元素。由于节点没有引用其上一个节点，因此必须事先存储其前一个元素。在更改引用之前，还需要另一个指针来存储下一个节点。不要忘记在最后返回新的头引用！
```java
public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
    }
    return prev;
}
``` 

复杂度分析 

时间复杂度：O(n)，假设 n 是列表的长度，时间复杂度是 O(n)。
空间复杂度：O(1)。


**递归**

递归版本稍微复杂一些，其关键在于反向工作。假设列表的其余部分已经被反转，现在我该如何反转它前面的部分？

假设列表为：

n1\... \ n_{k-1} \ n_{k} \ n_{k+1} \... \ n_{m} \ →∅

若从节点 n_{k+1} 到 n_{m}已经被反转，而我们正处于 n_{k}。

n_{1}\ ... \ n_{k-1} \ n_{k} \ n_{k+1} \... \n_{m}

我们希望 n_{k+1}​ 的下一个节点指向 n_{k}。

所以，n_{k}.next.next = n_{k}。

要小心的是 n_{1}的下一个必须指向
Ø。如果你忽略了这一点，你的链表中可能会产生循环。如果使用大小为 2
的链表测试代码，则可能会捕获此错误。

```java
public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode p = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return p;
}
```
复杂度分析

时间复杂度：O(n)，假设 n 是列表的长度，那么时间复杂度为 O(n)。
空间复杂度：O(n)，由于使用递归，将会使用隐式栈空间。递归深度可能会达到 n
层。
