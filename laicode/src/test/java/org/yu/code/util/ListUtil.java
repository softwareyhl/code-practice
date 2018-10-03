package org.yu.code.util;

import java.util.List;

public class ListUtil {
	public static <T> void printList(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static <T> void printListOfList(List<List<T>> list) {
		for (List<T> temp : list) {
			printList(temp);
		}
	} 
}
