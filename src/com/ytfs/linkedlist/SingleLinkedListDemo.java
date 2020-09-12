package com.ytfs.linkedlist;

/**
 * @author by ytfs
 * @Description 单向链表
 * @Create 2020/9/11-23:34
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {

        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //创建一个链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        //添加节点
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);

        //输出链表信息

        singleLinkedList.list();

    }
}


/**
 * @Description 定义单链表
 */
class SingleLinkedList {

    //初始化一个头结点,里面什么都不放
    HeroNode head = new HeroNode(0, "", "");

    /**
     * 向链表中添加一个节点
     * 不考虑编号顺序
     */
    public void add(HeroNode heroNode) {
        //因为头节点是不能动的，使用中间变量temp来保存头节点
        HeroNode temp = head;
        //遍历节点，找到最后一个节点【通过最后一个节点next指向为 null】
        while (true) {
            if (temp.next == null) {
                //找到最后一个节点
                break;
            }
            //没有找到就将temp后移一个
            temp = temp.next;
        }
        // 当循环退出的时候temp就指向节点的最后一个
        temp.next = heroNode;
    }



    /**
     * 遍历所有的节点
     */
    public void list() {
        //因为头节点是不能动的，使用中间变量temp来保存头节点
        HeroNode temp = head;
        while (true) {
            //判断链表是否为空
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            //将节点后移
            temp = temp.next;
        }
    }

}

/**
 * @Description 节点
 */
class HeroNode {
    public int no;
    public String name;
    public String nickName;
    public HeroNode next;  //指向下一个域

    /**
     * 构造器
     *
     * @param no
     * @param name
     * @param nickName
     */
    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName +
                '}';
    }


}