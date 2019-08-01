import java.util.*;
class CollectionDemo
{
	public static void main(String[] args)
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

	public static void sop(Object obj){
	System.out.println(obj);
		
	}
}
