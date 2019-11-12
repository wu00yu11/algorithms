package com.learn.algorithms.lru;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: algorithms
 * @description: lru
 * @author: zjj
 * @create: 2019-11-12 11:21
 **/
public class LRUCacheDemon {
    public static void main(String[] args) {
        System.out.println("intsertOrder start...");
        insertOrder();
        System.out.println("insertOrder end...");

        System.out.println("accessOrder start...");
        accessOrder();
        System.out.println("accessOrder end...");

        System.out.println("Lru start...");
        LRUCache cache = new LRUCache(true);
        cache.put("1", "lujunfa");
        cache.put("2", "lujunfa2");
        cache.put("3", "lujunfa3");
        cache.put("4", "lujunfa4");
        cache.put("5", "lujunfa5");
        cache.get("3");//将3节点排到最后
        Iterator iterator = cache.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("当cache中的数据容量大于5时，会丢弃最久未被使用的");
        cache.put("6", "lujunfa6");//设置LRUCache的缓存大小为5,所以当达到最大容量还往缓存放数据时，则前面的部分会被删除
        cache.put("7", "lujunfa7");
        Iterator iterator2 = cache.entrySet().iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("Lru end...");
    }

    /**
     * put时是什么顺序
     * get取出时就是什么顺序
     */
    static void  insertOrder() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>(10, 0.75f, false);

        for (int i = 0; i < 10; i++) {
            map.put("key" + i, i + "");
        }

        String s = map.get("key2");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    /**
     * get时会改变元素的顺序，会把该元素移到数据的末尾
     */
    static void accessOrder(){
        LinkedHashMap<String, String> map = new LinkedHashMap<>(10,0.75f,true);

        for(int i=0; i<10; i++) {
            map.put("key" + i, i+"");
        }

        String s = map.get("key2");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

}

class LRUCache extends LinkedHashMap<String, Object> {
    public LRUCache(boolean accessOrder) {//true 设置缓存为访问排序，即最新访问节点都排在队列的最后，最前面的都是最久未被使用的节点
        // TODO Auto-generated constructor stub
        super(16,(float) 0.75,accessOrder);
    }
    /**
     * 复写removeEldestEntry方法，实现当·达到阈值删除最久未使用的节点
     */
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<String, Object> eldest) {
        // TODO Auto-generated method stub
        if(size()>5) {
            return true;
        }
        else{
            return false;
        }
    }
}
