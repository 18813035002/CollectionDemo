import java.util.*;
class CollectionDemo
{
	public static void main(String[] args)
	{
	method_get();
	}

	//获取迭代器Iterator，取出对象中的元素
	public static void method_get()
	{
	ArrayList a1 = new ArrayList();
	a1.add("java01");
	a1.add("java02");
	a1.add("java03");
	a1.add("java04");
	
	//sop(a1);
	
	Iterator it = a1.iterator();
	while(it.hasNext())
	{
		sop(it.next());
	}
	
	
	/*
	for(Iterator it = a1.iterator(); it.hasNext();)
	{
		sop(it.next());
	}
	*/
	
	}	
	
	// 集合类操作的交集
	public static void method()
	{
	ArrayList a11 = new ArrayList();
	a11.add("java01");
	a11.add("java02");
	a11.add("java03");
	a11.add("java04");
	
	ArrayList a12 = new ArrayList();
	a12.add("java03");
	a12.add("java04");
	a12.add("java08");
	a12.add("java09");
	
	a11.retainAll(a12);//取交集
	
	sop("a11:"+a11);
	sop("a12:"+a12); 
	}

	// 一、集合类操作的基础方法
	public static void base_method()
	{
	//创建一个集合容器，使用Collection接口的子类.ArrayList
	ArrayList a1 = new ArrayList();
	
	//1.添加元素
	a1.add("java01");
	a1.add("java02");
	a1.add("java03");
	a1.add("java04");
	
	//打印原集合
	sop("a1="+a1);
	
	//2.获取个数，集合长度
	sop("size="+a1.size());
	
	//3.删除元素
	a1.remove("java02");
	
	//打印现集合
	sop("a1="+a1);
	//现在的长度
	sop("size="+a1.size());
	
	
	}

	// 二、输出对象函数
	public static void sop(Object obj)
	{
	System.out.println(obj);
	}
}
