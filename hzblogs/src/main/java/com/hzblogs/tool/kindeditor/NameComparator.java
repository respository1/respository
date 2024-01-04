package com.hzblogs.tool.kindeditor;

import java.util.Comparator;
import java.util.Hashtable;

/**
* @author zzke
* @version 创建时间：2019年7月11日 上午11:20:11
* @ClassName 
* @Description 
*/
public class NameComparator implements Comparator {
	public int compare(Object a, Object b) {
		Hashtable hashA = (Hashtable)a;
		Hashtable hashB = (Hashtable)b;
		if (((Boolean)hashA.get("is_dir")) && !((Boolean)hashB.get("is_dir"))) {
			return -1;
		} else if (!((Boolean)hashA.get("is_dir")) && ((Boolean)hashB.get("is_dir"))) {
			return 1;
		} else {
			return ((String)hashA.get("filename")).compareTo((String)hashB.get("filename"));
		}
	}
}
